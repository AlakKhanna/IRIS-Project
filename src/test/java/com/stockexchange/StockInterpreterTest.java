package com.stockexchange;

import com.stockexchange.interpreter.StockInterpreter;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class StockInterpreterTest {

    @Test
    public void testParseCsv() {
        StockInterpreter interpreter = new StockInterpreter();
        String filePath = "src/main/java/resources/Stock_Model - Sheet6.csv";

        try {
            interpreter.parseCsv(filePath);
            System.out.println("CSV parsed successfully from: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to parse CSV", e);
        }
    }
}
