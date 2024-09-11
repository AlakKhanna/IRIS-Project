package com.stockexchange;

import com.stockexchange.interpreter.StockInterpreter;
import com.stockexchange.singleton.DatabaseManager;
import com.stockexchange.service.OrderManager;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        StockInterpreter interpreter = new StockInterpreter();
        try {
            interpreter.parseCsv("src/main/resources/stock_exchange_data.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }

        DatabaseManager dbManager = DatabaseManager.getInstance();
        OrderManager orderManager = new OrderManager();
        // Place orders and manage stock data
    }
}
