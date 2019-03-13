package me.nuncan.hiringmodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class ModelingHiringApplication {

    public static void main(String[] args) {

        SpringApplication.run(ModelingHiringApplication.class, args);
    }

}