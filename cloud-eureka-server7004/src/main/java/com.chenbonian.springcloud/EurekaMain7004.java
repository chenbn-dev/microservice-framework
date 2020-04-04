package com.chenbonian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chbn
 * @create 2020-04-04 16:34
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7004 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7004.class,args);
    }
}
