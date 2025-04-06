package com.genie.Welcome_API.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WelcomeController {

    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private GreetFiegnClient greetFiegnClient;

   /* @GetMapping("/welcome")
    public String welcome()
    {
        String welcomeMsg= " Welcome to Codeforsuccess...";
        String greet = restTemplate.getForObject("http://localhost:9090/greet", String.class);
        return greet + welcomeMsg;
    }*/
    @GetMapping("/welcome")
    public String welcome()
    {
        String welcomeMsg= " Welcome to Codeforsuccess...";
       String greet= greetFiegnClient.invokeGreetApi();
        return greet + welcomeMsg;
    }

}
