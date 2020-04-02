package cn.chenbonian.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 支付实体类
 * @author chbn
 * @create 2020-04-01 20:54
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Long id;// 主键是bigint，所以选long
    private String serial;

}
