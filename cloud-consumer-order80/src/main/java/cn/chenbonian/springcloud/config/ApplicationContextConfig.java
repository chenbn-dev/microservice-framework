package cn.chenbonian.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 相当于一个Spring的xml的配置文件，用IOC的方式创建一个新对象
 * @author chbn
 * @create 2020-04-02 21:46
 */

/*
    SpringBoot优化了spring的配置文件
    将spring的 applicationContext.xml 简化成注解版的@Configuration配置
    加了@Configuration改注解的类等同于以前Spring的applicationContext.xml文件
    原来applicationContext.xml文件中要加的 <bean id="userService"   class="com.atguigu.tmall.UserServiceImpl"/>
    变成
    @Bean
    public UserService getUserService(){
        return new UserServiceImpl();
    }

    其中@Bean相当于原来 xml文件中的 <bean/> 节点
    id 相当于返回值方法返回值类型  class相当于返回值

 */
@Configuration
public class ApplicationContextConfig {
    // 相当于Spring的 applicationContextConfig.xml的配置文件，<bean id="" class="">
    @Bean
    // @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
