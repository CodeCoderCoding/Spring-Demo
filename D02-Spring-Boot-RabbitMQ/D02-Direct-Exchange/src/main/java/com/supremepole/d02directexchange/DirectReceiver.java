package com.supremepole.d02directexchange;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author CodeCoderCoding
 */
@Component
public class DirectReceiver {
    @RabbitListener(queues = "hello-queue")
    public void handler1(String msg) {
        System.out.println("DirectReceiver:" + msg);
    }
}
