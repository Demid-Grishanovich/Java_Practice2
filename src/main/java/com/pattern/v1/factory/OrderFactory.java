package com.pattern.v1.factory;

import com.pattern.v1.model.Order;

public class OrderFactory {

    private static Long orderCounter = 0L;

    public static Order createOrder() {
        return new Order(orderCounter++);
    }
}
