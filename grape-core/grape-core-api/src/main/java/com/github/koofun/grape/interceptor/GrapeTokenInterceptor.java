package com.github.koofun.grape.interceptor;

import com.github.koofun.grape.annotation.GrapeToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Slf4j
@Component
public class GrapeTokenInterceptor extends InterceptorBase {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (!hasClassAnnotation(handler, GrapeToken.class)) {
            return true;
        }
        // TODO decode and check token
        return true;
    }
}
