package com.pattern.v1.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pattern.v1.model.Order;
import com.pattern.v1.repository.OrderRepository;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class DataLoaderService {
    private OrderRepository orderRepository;

    public DataLoaderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void loadDataFromFile(String path) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Order[] orders = mapper.readValue(new File(path), Order[].class);
        Arrays.stream(orders).forEach(orderRepository::addOrder);
    }
}
