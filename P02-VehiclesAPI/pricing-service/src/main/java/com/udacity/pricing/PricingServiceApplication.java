package com.udacity.pricing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Creates a Spring Boot Application to run the Pricing Service.
 * TODO: Convert the application from a REST API to a microservice.
 */
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PricingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PricingServiceApplication.class, args);
    }

}
