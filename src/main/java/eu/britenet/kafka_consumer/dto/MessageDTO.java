package eu.britenet.kafka_consumer.dto;

import lombok.Data;

@Data
public class MessageDTO {
    private String key;
    private String text;
}
