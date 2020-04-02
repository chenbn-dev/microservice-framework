package cn.chenbonian.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Json封装体
 * 返回给给前端的通用的Json实体串
 * @author chbn
 * @create 2020-04-01 20:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;
    private String message;
    private T data;

    /**
     * 泛型data有可能为null，定义两个参数的构造方法
     */
    public CommonResult(Integer code,String message){ 
        
        this(code,message,null);

    }
}
