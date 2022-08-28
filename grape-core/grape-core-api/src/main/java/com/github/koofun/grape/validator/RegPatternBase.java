package com.github.koofun.grape.validator;

import com.github.koofun.grape.exception.ErrorCode;
import com.github.koofun.grape.exception.GrapeException;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.regex.Pattern;

public class RegPatternBase<A extends Annotation> implements ConstraintValidator<A, String> {
    private List<Pattern> patterns;
    protected boolean required;
    protected ErrorCode code;

    public void setPatterns(List<Pattern> patterns) {
        this.patterns = patterns;
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext context) {
        if (StringUtils.isEmpty(s)) {
            if (required) {
                throw new GrapeException(code);
            } else {
                return true;
            }
        }

        patterns.forEach(pattern -> {
            if (!pattern.matcher(s).matches()) {
                throw new GrapeException(code);
            }
        });
        return false;
    }
}
