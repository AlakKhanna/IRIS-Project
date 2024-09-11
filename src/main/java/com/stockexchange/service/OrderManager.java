package com.stockexchange.service;

import com.stockexchange.model.Order;

public class OrderManager {
    public void placeOrder(Order order) {
        Runnable task = () -> {
            // Process the order
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}
