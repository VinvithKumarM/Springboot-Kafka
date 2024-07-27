package com.vinvith.springboot_kafka_tutorial.Kafka;

import com.vinvith.springboot_kafka_tutorial.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "Javaguides_Json", groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("Json Message received -> %s", user.toString()));
    }
}
