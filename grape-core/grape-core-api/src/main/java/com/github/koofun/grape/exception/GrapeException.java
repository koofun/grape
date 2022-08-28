package com.github.koofun.grape.exception;

import lombok.Getter;

@Getter
public class GrapeException extends RuntimeException {
    static final long serialVersionUID = -7434895690125766439L;
    private ErrorCode errorCode;

    public GrapeException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
