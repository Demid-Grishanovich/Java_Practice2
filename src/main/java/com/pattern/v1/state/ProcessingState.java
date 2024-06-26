package com.pattern.v1.state;

import com.pattern.v1.model.Order;

public class ProcessingState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new ShippedState());
        System.out.println("The order has been shipped.");
    }

    @Override
    public void prev(Order order) {
        order.setState(new NewOrderState());
        System.out.println("The order is back to new order com.pattern.v1.state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is being processed.");
    }
}
