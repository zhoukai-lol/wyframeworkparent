package com.wangyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication//扫描所在包及子包的bean，注入到ioc中
@EnableEurekaClient
@MapperScan("com.wangyi.dao")
public class WyServiceManageCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WyServiceManageCmsApplication.class,args);
    }
}
