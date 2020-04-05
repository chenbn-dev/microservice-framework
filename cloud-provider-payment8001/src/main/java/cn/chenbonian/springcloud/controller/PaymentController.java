package cn.chenbonian.springcloud.controller;

import cn.chenbonian.springcloud.entities.CommonResult;
import cn.chenbonian.springcloud.entities.Payment;
import cn.chenbonian.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 控制层
 * @author chbn
 * @create 2020-04-01 22:26
 */
@RestController //Controller调Service；Service调DAO
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入数据返回值："+result);
        if(result>0){
            return new CommonResult(200,"插入数据成功,ServerPort:"+serverPort,result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("查询id："+id);
        if(payment != null){
            return new CommonResult(200,"查询成功，ServerPort："+serverPort,payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询ID："+id ,null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery(){
        // 获得在Eureka中注册的所有微服务，即微服务清单列表
        List<String> services = discoveryClient.getServices();
        for (String service : services){
            log.info("Eureka集群中注册的微服务:" + service);
        }
        // 根据微服务的具体服务名称，进一步获得这个微服务的相关信息（一个微服务下的全部实例）
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
        for (ServiceInstance instance : instances){
            log.info("serviceID："+instance.getServiceId()+"；\t"+"Host："+instance.getHost()+"；\t"+"Port："+instance.getPort()+"；\t"+"Uri:"+instance.getUri());
        }
        return this.discoveryClient;
    }
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }

}
