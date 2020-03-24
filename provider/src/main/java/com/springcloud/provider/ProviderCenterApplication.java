package com.springcloud.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.springcloud.provider.mapper")
public class ProviderCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderCenterApplication.class, args);
    }

}
