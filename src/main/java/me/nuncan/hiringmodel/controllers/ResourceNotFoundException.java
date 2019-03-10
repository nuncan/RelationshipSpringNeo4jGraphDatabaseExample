/*
package me.nuncan.hiringmodel.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ControllerAdvice
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {

    @Bean(name = "errorMessage")
    public String getMessage() {
        return super.getMessage();
    }

    @Lazy
    public ResourceNotFoundException(@Qualifier(value = "errorMessage") String message) {
        log.error(message, super.getCause());
    }
}*/
