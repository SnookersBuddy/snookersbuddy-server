package com.example.testapplicationbe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
@RestController
public class TestApplicationBeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplicationBeApplication.class, args);
    }

}
