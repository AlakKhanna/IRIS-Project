package com.stockexchange.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {
    public static BufferedReader readCsv(String filePath) throws IOException {
        return new BufferedReader(new FileReader(filePath));
    }
}
