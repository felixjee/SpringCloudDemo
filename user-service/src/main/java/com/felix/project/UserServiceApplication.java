package com.felix.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import tk.mybatis.spring.annotation.MapperScan;


@EnableEurekaClient
@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrix
@MapperScan(basePackages = "com.felix.project.mapper")
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class,args);
    }

}
