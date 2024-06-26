package com.pattern.v1.model;

import com.pattern.v1.state.OrderState;
import com.pattern.v1.state.ProcessingState; // Пример состояния

public class Order {
    private Long id;
    private OrderState state;

    public Order(Long id) {
        this.id = id;
        this.state = new ProcessingState(); // Начальное состояние
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void returnToPreviousState() {
        // Логика возвращения к предыдущему состоянию, если есть история состояний
    }
}
