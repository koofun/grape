package com.github.koofun.grape.validator;

import com.github.koofun.grape.exception.ErrorCode;

import javax.validation.Constraint;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = UUIDValidator.class)
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface UUID {
    boolean required() default true;
    ErrorCode code() default ErrorCode.INVALID_ID;

    Class[] groups() default {};

    Class[] payload() default {};
}
