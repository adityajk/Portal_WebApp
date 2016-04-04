package com.wellsfargo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class Application {


    public static void main(String[] args) throws Throwable {
        SpringApplication.run(Application.class, args);
    }
    
    
}