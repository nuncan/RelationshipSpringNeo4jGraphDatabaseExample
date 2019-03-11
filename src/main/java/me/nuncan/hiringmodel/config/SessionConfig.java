package me.nuncan.hiringmodel.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceExceptionConverter;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

import javax.annotation.Resource;

@Slf4j
@Configuration
@EnableRedisHttpSession
public class SessionConfig extends AbstractHttpSessionApplicationInitializer {

    @Bean
    @Resource
    public LettuceExceptionConverter connectionFactory() {

        log.debug("Session Returned");
        return new LettuceExceptionConverter();
    }
}