package cn.chenbonian.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 *
 * @author chbn
 * @create 2020-04-05 20:14
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
