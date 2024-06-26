package com.pattern.v1.state;


import com.pattern.v1.model.Order;

public interface OrderState {
    void next(Order order);
    void prev(Order order);
    void printStatus();
}

