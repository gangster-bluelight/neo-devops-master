package com.neo.authenticate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wjj70
 */
@EnableDiscoveryClient
@SpringBootApplication
public class AuthenticateApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthenticateApplication.class);
    }
}