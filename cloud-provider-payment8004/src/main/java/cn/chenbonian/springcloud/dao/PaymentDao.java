package cn.chenbonian.springcloud.dao;

import cn.chenbonian.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 数据库访问接口  即mybatis调的接口
 * @author chbn
 * @create 2020-04-01 21:09
 */
@Mapper // mybatis尽量用@Mapper注解
public interface PaymentDao {

    //增删改查，按ID查，全部查，分页查等
    /**
    * 新增（插入）一条数据，即写操作
    * @author chbn
    * @date 2020/4/1
    * @param payment 支付实体对象，封装支付信息
    * @retur 受影响行数
    */
    public int create(Payment payment);// 新增数据方法名一般为add，create，save

    /**
    * 按id查询，即读操作
    * @author chbn
    * @date 2020/4/1
    * @param id 要查询实体的id
    * @retur Payment实体
    */
    public Payment getPaymentById(@Param("id") Long id);

}
