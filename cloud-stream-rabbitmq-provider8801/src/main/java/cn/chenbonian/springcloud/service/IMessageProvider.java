package cn.chenbonian.springcloud.service;

/**
 *
 * 消息生产者
 * @author chenbn
 * @version 1.0
 * @create 2020/04/11
 */
public interface IMessageProvider {
    /**
     * 消息发送
     * @return
     */
    String send();
}
