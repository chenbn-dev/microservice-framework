package cn.chenbonian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chbn
 * @create 2020-04-04 16:34
 */

@EnableEurekaServer // 表示是eureka的服务注册中心
@SpringBootApplication
public class EurekaMain7005 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7005.class,args);
    }
}
