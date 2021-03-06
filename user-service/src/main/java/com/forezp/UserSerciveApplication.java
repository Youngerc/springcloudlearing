package com.forezp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserSerciveApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserSerciveApplication.class, args);
    }
}
