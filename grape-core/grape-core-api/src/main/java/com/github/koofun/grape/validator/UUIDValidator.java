package com.github.koofun.grape.validator;

import java.util.List;
import java.util.regex.Pattern;

public class UUIDValidator extends RegPatternBase<UUID> {
    private final static String PATTERN = "^([a-f0-9-]{36})$";

    @Override
    public void initialize(UUID annotation) {
        this.required = annotation.required();
        this.code = annotation.code();
        setPatterns(List.of(Pattern.compile(PATTERN)));
    }
}
