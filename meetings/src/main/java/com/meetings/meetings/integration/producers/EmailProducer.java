package com.meetings.meetings.integration.producers;


import com.meetings.meetings.integration.models.SerializableEmail;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailProducer {

//    @Value("${routing.simple.email}")
//    private String emailDirectRoutingKey;
//
//    @Value("${exchange.direct}")
//    private String directExchange;
//
//    private final RabbitTemplate rabbitTemplate;
//
//    public EmailProducer(RabbitTemplate rabbitTemplate) {
//        this.rabbitTemplate = rabbitTemplate;
//    }
//
//    public void produce(SerializableEmail serializableEmail) {
//        rabbitTemplate.convertAndSend(directExchange, emailDirectRoutingKey, serializableEmail);
//    }

}
