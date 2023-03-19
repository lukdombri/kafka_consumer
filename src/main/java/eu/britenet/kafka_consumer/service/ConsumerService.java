package eu.britenet.kafka_consumer.service;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ConsumerService {

    private static final String KAFKA_TOPIC = "testTopic";

    @KafkaListener(topics = KAFKA_TOPIC, groupId = "first")
    public void consume(@Payload String message){
      log.info(message);
    }
}
