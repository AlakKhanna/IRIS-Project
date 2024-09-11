package com.stockexchange;

import com.stockexchange.model.StockData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StockDataTest {

    private StockData stock;

    @BeforeEach
    public void setUp() {
        stock = new StockData("Test Stock", 100.0, 120.0, 80.0);
    }

    @Test
    public void testCalculateMarketShare() {
        stock.calculateMarketShare(5000000, 100000000);
        assertEquals(0.05, stock.getMarketCap(), 0.01, "Market Cap should be 5%");
    }

    @Test
    public void testCalculateAnnualGrowth() {
        stock.calculateAnnualGrowth();
        assertEquals(50.0, stock.getAnnualGrowth(), 0.01, "Annual Growth should be 50%");
    }
}
