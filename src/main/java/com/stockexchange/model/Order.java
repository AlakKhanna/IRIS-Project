package com.stockexchange.model;

public class Order {
    private String stockName;
    private int quantity;
    private double price;
    private String type; // BUY or SELL

    // Constructor
    public Order(String stockName, int quantity, double price, String type) {
        this.stockName = stockName;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
    }

    // Getters and Setters
}
