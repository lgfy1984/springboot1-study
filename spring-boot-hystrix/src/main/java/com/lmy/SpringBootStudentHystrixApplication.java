package com.lmy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableCaching// 开启缓存，需要显示的指定
@EnableAsync// 开启异步
@EnableHystrixDashboard
@EnableCircuitBreaker
public class SpringBootStudentHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStudentHystrixApplication.class, args);
    }
}
