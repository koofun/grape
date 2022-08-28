package com.github.koofun.grape.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ErrorCode {
    INTERNAL_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "grape.0001", "internal error"),
    INVALID_ID(HttpStatus.BAD_REQUEST, "grape.0001", "invalid id"),




    UNUSED_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "grape.9999", "unused error");

    ErrorCode(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    private HttpStatus status;

    private String code;

    private String message;
}
