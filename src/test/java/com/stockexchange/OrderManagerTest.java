package com.stockexchange;

import com.stockexchange.model.Order;
import com.stockexchange.service.OrderManager;
import org.junit.jupiter.api.Test;

public class OrderManagerTest {

    @Test
    public void testPlaceOrder() {
        OrderManager manager = new OrderManager();
        Order order = new Order("Test Stock", 10, 100.0, "BUY");

        // Place order
        manager.placeOrder(order);

        // Here you would add assertions based on how you expect orders to be handled.
        // This could involve checking internal state, database changes, etc.
        System.out.println("Order placed: " + order);
    }
}
