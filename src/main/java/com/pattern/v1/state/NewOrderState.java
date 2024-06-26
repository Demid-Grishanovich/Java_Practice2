package com.pattern.v1.state;

import com.pattern.v1.model.Order;

public class NewOrderState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new ProcessingState());
        System.out.println("The order is now in processing com.pattern.v1.state.");
    }

    @Override
    public void prev(Order order) {
        System.out.println("The order is in its initial com.pattern.v1.state.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order placed, not processed yet.");
    }
}
