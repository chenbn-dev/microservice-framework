package cn.chenbonian.springcloud.controller;

import cn.chenbonian.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * @author chenbn
 * @version 1.0
 * @create 2020/04/11
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;

    @GetMapping("/sendMessage")
    public String sendMessage(){
         return messageProvider.send();
    }
}
