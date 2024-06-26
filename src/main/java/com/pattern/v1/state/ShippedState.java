package com.pattern.v1.state;

import com.pattern.v1.model.Order;

public class ShippedState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("The order has already been shipped and will be delivered soon.");
    }

    @Override
    public void prev(Order order) {
        order.setState(new ProcessingState());
        System.out.println("The order is back to processing com.pattern.v1.state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order shipped and is on the way.");
    }
}
