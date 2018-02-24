package com.springcloud.serverless;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.task.launcher.TaskLaunchRequest;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Component;
import org.springframework.cloud.stream.messaging.Source;

import java.lang.reflect.Array;
import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@EnableBinding(Source.class)
public class TaskConsumer {

    @Autowired
    private Source source;

    public void PublishRequest(String payload)
    {
        String tasKUrl = "maven://com.springcloud.serverless:task:jar:1.0-SNAPSHOT";

        List<String> input = new ArrayList<String>(Arrays.asList(payload.split(",")));
        TaskLaunchRequest launchRequest = new TaskLaunchRequest(tasKUrl, input, null, null, null);

        System.out.println("Created input Request");
        GenericMessage<TaskLaunchRequest> message = new GenericMessage<>(launchRequest);
        source.output().send(message);
    }
}
