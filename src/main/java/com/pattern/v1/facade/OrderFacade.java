package com.pattern.v1.facade;

import com.pattern.v1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderFacade {

    @Autowired
    private OrderService orderService;

    public void placeOrder() {
        orderService.placeOrder();
    }

    public void processOrder(Long orderId) {
        orderService.processOrder(orderId);
    }

    public void shipOrder(Long orderId) {
        orderService.shipOrder(orderId);
    }

    public void returnOrder(Long orderId) {
        orderService.returnOrder(orderId);
    }
}
