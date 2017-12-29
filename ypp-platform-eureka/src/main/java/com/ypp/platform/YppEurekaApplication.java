package com.ypp.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class YppEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(YppEurekaApplication.class, args);
    }

}
