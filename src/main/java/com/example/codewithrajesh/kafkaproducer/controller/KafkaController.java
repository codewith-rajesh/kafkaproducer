package com.example.codewithrajesh.kafkaproducer.controller;

import com.example.codewithrajesh.kafkaproducer.producer.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final TopicProducer topicProducer;

    @PostMapping(value = "/send")
    public String send(@RequestBody String message) {
        topicProducer.send(message);
        return "message sent successfully";
    }
}
