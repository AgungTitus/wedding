package com.wedding_planner.wedding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.wedding_planner.wedding.repository")  // ← ADD
public class WeddingApplication {
    public static void main(String[] args) {
        SpringApplication.run(WeddingApplication.class, args);
    }
}
