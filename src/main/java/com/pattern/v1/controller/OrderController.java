package com.pattern.v1.controller;

import com.pattern.v1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping("/place")
    public String placeOrder() {
        orderService.placeOrder();
        return "Order placed successfully";
    }

    @GetMapping("/{orderId}/process")
    public String processOrder(@PathVariable Long orderId) {
        orderService.processOrder(orderId);
        return "Order is being processed";
    }

    @GetMapping("/{orderId}/ship")
    public String shipOrder(@PathVariable Long orderId) {
        orderService.shipOrder(orderId);
        return "Order has been shipped";
    }

    @GetMapping("/{orderId}/return")
    public String returnOrder(@PathVariable Long orderId) {
        orderService.returnOrder(orderId);
        return "Order has been returned to previous state";
    }
}
