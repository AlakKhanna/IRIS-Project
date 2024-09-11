package com.stockexchange.factory;

import com.stockexchange.model.StockData;

public class StockDataFactory {
    public static StockData createStockData(String name, double openPrice, double highPrice, double lowPrice) {
        return new StockData(name, openPrice, highPrice, lowPrice);
    }
}
