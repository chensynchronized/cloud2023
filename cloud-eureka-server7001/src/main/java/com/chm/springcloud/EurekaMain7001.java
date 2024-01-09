package com.chm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication //开启Eureka注册中心，表示此项目为EurekaServer的服务端
public class EurekaMain7001 {
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaMain7001.class,args);
    }
}
