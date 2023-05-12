package com.br.mlb.rabbitmq.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class RabbirMQConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(RabbirMQConsumer.class);

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void consumeQueue(String message) {
        LOGGER.info(String.format("Received message -> %s", message));
    }
}
