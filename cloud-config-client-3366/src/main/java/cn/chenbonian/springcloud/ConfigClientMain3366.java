package cn.chenbonian.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chbn
 * @create 2020-04-11 10:06
 */
@EnableEurekaClient
@SpringBootApplication
public class ConfigClientMain3366 {
    public static void main(String[] args) {
        Class clazz = ConfigClientMain3366.class;
        SpringApplication.run(ConfigClientMain3366.class,args);
    }
}
