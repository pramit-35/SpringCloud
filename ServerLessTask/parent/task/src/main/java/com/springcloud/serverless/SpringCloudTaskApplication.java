package com.springcloud.serverless;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableTask
public  class SpringCloudTaskApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringCloudTaskApplication.class, args);
    }

    @Bean
    public TaskProcessor taskProcessor()
    {
        return new TaskProcessor();
    }
}
