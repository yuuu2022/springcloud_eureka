package com.eureka.user.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/testuser")
    public String testUser() {
        return "testUser";
    }
    
    @GetMapping("/getapifromorder")
    public String getMethodName() {
        // this is a method to get data from order before use eureka.
        String response = restTemplate.getForObject("http://localhost:8082/order/testorder", String.class);
        return response;
    }
    
}
