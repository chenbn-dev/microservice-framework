package cn.chenbonian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 向Eureka中注册的消费者主启动类， 80是http协议默认端口，可以省略，对于用户更友好
 * @author chbn
 * @create 2020-04-02 0:47
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class,args);
    }
}
