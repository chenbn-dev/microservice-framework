package cn.chenbonian.springcloud.service;

import cn.chenbonian.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * 业务层接口
 * @author chbn
 * @create 2020-04-01 22:15
 */
public interface PaymentService {
    //增删改查，按ID查，全部查，分页查等
    /**
     * 新增（插入）一条数据，即写操作
     * @author chbn
     * @date 2020/4/1
     * @param payment 支付实体对象，封装支付信息
     * @retur 受影响行数
     */
    int create(Payment payment);// 新增数据方法名一般为add，create，save

    /**
     * 按id查询，即读操作
     * @author chbn
     * @date 2020/4/1
     * @param id 要查询实体的id
     * @retur Payment实体
     */
    Payment getPaymentById(@Param("id") Long id);

}
