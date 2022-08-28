package com.github.koofun.grape.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GrapeConfiguration implements WebMvcConfigurer {
    private final GrapeTokenInterceptor grapeTokenInterceptor;

    public GrapeConfiguration(GrapeTokenInterceptor grapeTokenInterceptor) {
        this.grapeTokenInterceptor = grapeTokenInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(grapeTokenInterceptor);
    }
}
