package com.github.koofun.grape.interceptor;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import java.lang.annotation.Annotation;

public abstract class InterceptorBase implements HandlerInterceptor {
    public <A extends Annotation> boolean hasClassAnnotation(Object handler, Class<A> clazz) {
        return getClassAnnotation(handler, clazz) != null;
    }

    public <A extends Annotation> boolean hasMethodAnnotation(Object handler, Class<A> clazz) {
        return getMethodAnnotation(handler, clazz) != null;
    }

    public <A extends Annotation> A getClassAnnotation(Object handler, Class<A> clazz) {
        if (!(handler instanceof HandlerMethod)) {
            return null;
        }

        var handlerMethod = (HandlerMethod) handler;
        return handlerMethod.getBeanType().getAnnotation(clazz);
    }

    public <A extends Annotation> A getMethodAnnotation(Object handler, Class<A> clazz) {
        if (!(handler instanceof HandlerMethod)) {
            return null;
        }

        var handlerMethod = (HandlerMethod) handler;
        return handlerMethod.getMethod().getAnnotation(clazz);
    }
}