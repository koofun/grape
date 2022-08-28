package com.github.koofun.grape.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static com.github.koofun.grape.exception.ErrorCode.INTERNAL_ERROR;

@ControllerAdvice
public class GrapeExceptionHandler {
    @ExceptionHandler(Exception.class)
    ResponseEntity<String> exceptionHandler(Exception exception) {
        if (exception instanceof GrapeException) {
            var e = (GrapeException) exception;
            return new ResponseEntity<>(e.getErrorCode().getMessage(), e.getErrorCode().getStatus());
        }

        return new ResponseEntity<>(INTERNAL_ERROR.getMessage(), INTERNAL_ERROR.getStatus());
    }
}
