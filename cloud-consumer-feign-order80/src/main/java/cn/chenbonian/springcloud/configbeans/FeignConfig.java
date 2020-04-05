package cn.chenbonian.springcloud.configbeans;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * OpenFeignClient配置
 * @author chbn
 * @create 2020-04-06 1:35
 */
@Configuration
public class FeignConfig {
    //feignClient配置日志级别
    @Bean
    Logger.Level feignLoggerLevel() {
        // 请求和响应的头信息,请求和响应的正文及元数据
        return Logger.Level.FULL;
    }


}
