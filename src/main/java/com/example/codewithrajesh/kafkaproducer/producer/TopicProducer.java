package com.example.codewithrajesh.kafkaproducer.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TopicProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Value("${topic.name.producer}")
    private String topicName;

    public void send(String message) {
        log.info("Message: {}", message);
        kafkaTemplate.send(topicName, message);
    }

}
