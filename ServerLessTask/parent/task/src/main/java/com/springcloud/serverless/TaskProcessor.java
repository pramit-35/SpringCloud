package com.springcloud.serverless;

import org.springframework.boot.CommandLineRunner;

public class TaskProcessor implements CommandLineRunner
{
    @Override
    public void run(String... strings) throws Exception {

        if(null != strings)
        {
            String parameter1= strings[0];
            String parameter2= strings[1];
            String parameter3= strings[2];

            System.out.println("firts parameter is " + parameter1 +", parameter2 is" + parameter2 +" , parameter 3 is " + parameter3);
        }
    }
}

