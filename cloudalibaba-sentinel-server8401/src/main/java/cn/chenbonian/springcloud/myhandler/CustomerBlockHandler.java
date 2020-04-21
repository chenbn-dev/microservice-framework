package cn.chenbonian.springcloud.myhandler;

import cn.chenbonian.springcloud.entities.CommonResult;
import com.alibaba.csp.sentinel.slots.block.BlockException;


/**
 *
 * @author chenbn
 * @version 1.0
 * @create 2020/04/16
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(444, "客户自定义，global handlerException---1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444, "客户自定义，global handlerException---2");
    }
}
