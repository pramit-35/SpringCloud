package com.springcloud.serverless;

import com.sun.net.httpserver.Authenticator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Path;

@RestController
public class TaskController {

    @Autowired
    public TaskConsumer consumer;

    @RequestMapping(path="/task", method = RequestMethod.POST)
    public @ResponseBody String  LaunchTask(@RequestBody String s)
    {
        consumer.PublishRequest(s);

        System.out.println("Request submitted" + s);

        return "Success";
    }
}
