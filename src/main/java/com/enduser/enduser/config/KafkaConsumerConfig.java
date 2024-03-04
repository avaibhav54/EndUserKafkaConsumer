package com.enduser.enduser.config;

import com.enduser.enduser.constant.Group;
import com.enduser.enduser.constant.Topic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerConfig {

    @KafkaListener(topics = Topic.LOCATION_TOPIC_NAME, groupId = Group.LOCATION_GROUP_ID)
    public void updateLocation(String location) {
        System.out.println("Received location update: " + location);
    }
}
