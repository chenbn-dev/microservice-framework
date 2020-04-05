package cn.chenbonian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 向consol中注册的服务提供者主启动类
 * @author chbn
 * @create 2020-04-05 12:25
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8007 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8007.class, args);
    }
}
