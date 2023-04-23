package com.example.codewithrajesh.kafkaproducer.controller;

import com.example.codewithrajesh.kafkaproducer.producer.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final TopicProducer topicProducer;

    @PostMapping(value = "/send")
    public String send(@RequestParam String message) {
        topicProducer.send(message);
        return "message sent successfully";
    }
}
