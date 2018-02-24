package com.springcloud.serverless;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfig {

    @Bean
    public TaskConsumer taskConsumer()
    {
        return new TaskConsumer();
    }
}
