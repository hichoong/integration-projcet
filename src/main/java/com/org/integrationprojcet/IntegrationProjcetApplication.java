package com.org.integrationprojcet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class IntegrationProjcetApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegrationProjcetApplication.class, args);
    }
}
