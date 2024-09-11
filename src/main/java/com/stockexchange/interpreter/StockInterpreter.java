package com.stockexchange.interpreter;

import com.stockexchange.model.StockData;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class StockInterpreter {

    public void parseCsv(String filePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Skip header line
            String header = br.readLine();

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                // Check if there are enough values and they are numeric
                if (values.length >= 4) {
                    String name = values[0];
                    double openPrice = parseDouble(values[1]);
                    double highPrice = parseDouble(values[2]);
                    double lowPrice = parseDouble(values[3]);

                    StockData stock = new StockData(name, openPrice, highPrice, lowPrice);

                    // Process the StockData object as needed
                    System.out.println("Processed stock: " + stock.getName());
                }
            }
        }
    }

    private double parseDouble(String value) {
        try {
            return Double.parseDouble(value.trim());
        } catch (NumberFormatException e) {
            System.err.println("Failed to parse value: " + value);
            return 0.0; // or handle this case as appropriate
        }
    }
}
