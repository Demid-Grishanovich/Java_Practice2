package com.pattern.v1.service;

import com.pattern.v1.model.Order;
import com.pattern.v1.repository.OrderRepository;
import com.pattern.v1.state.ProcessingState;
import com.pattern.v1.state.ShippedState;
import com.pattern.v1.factory.OrderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public void placeOrder() {
        Order newOrder = OrderFactory.createOrder(); // Создание заказа через фабрику
        orderRepository.addOrder(newOrder);
    }

    public void processOrder(Long orderId) {
        Order order = orderRepository.getOrderById(orderId);
        if (order != null) {
            order.setState(new ProcessingState());
        }
    }

    public void shipOrder(Long orderId) {
        Order order = orderRepository.getOrderById(orderId);
        if (order != null) {
            order.setState(new ShippedState());
        }
    }

    public void returnOrder(Long orderId) {
        Order order = orderRepository.getOrderById(orderId);
        if (order != null) {
            order.returnToPreviousState();
        }
    }
}
