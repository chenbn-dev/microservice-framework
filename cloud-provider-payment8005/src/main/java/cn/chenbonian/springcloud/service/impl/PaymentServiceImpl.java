package cn.chenbonian.springcloud.service.impl;

import cn.chenbonian.springcloud.dao.PaymentDao;
import cn.chenbonian.springcloud.entities.Payment;
import cn.chenbonian.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 业务层接口实现类
 * @author chbn
 * @create 2020-04-01 22:18
 */
@Service    // 肌肉记忆：实现类加 @Service  dao类加@Mapper
public class PaymentServiceImpl implements PaymentService {

    @Resource   // @Autowired 是spring的注解，@Resource 是JavaEE的注解，也可以进行依赖注入
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
