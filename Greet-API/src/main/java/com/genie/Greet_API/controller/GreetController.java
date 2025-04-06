package com.genie.Greet_API.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    private static final Logger logger= LoggerFactory.getLogger(GreetController.class);

    @Autowired
    private Environment environment;
    @GetMapping("/greet")
    public String greetMsg()
    {
        logger.info("inside greer msg method....");
        String port=environment.getProperty("server.port");
        System.out.println("running on port = "+port);
        return "Good Morning.. "+port;
    }
}
