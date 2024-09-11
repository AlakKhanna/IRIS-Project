package com.stockexchange.builder;

import com.stockexchange.model.StockData;

public class StockDataBuilder {
    private String name;
    private double openPrice;
    private double highPrice;
    private double lowPrice;

    public StockDataBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StockDataBuilder setOpenPrice(double openPrice) {
        this.openPrice = openPrice;
        return this;
    }

    public StockDataBuilder setHighPrice(double highPrice) {
        this.highPrice = highPrice;
        return this;
    }

    public StockDataBuilder setLowPrice(double lowPrice) {
        this.lowPrice = lowPrice;
        return this;
    }

    public StockData build() {
        return new StockData(name, openPrice, highPrice, lowPrice);
    }
}
