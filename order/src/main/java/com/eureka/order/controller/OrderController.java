package com.eureka.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    
    @RequestMapping("/testorder")
    public String testOrder() {
        return "testOrder";
    }
}
