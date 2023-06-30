package com.example.testservice3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Testservice3Application {

    public static void main(String[] args) {
        SpringApplication.run(Testservice3Application.class, args);
    }

}
