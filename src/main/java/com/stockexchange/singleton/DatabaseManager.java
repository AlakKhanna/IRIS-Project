package com.stockexchange.singleton;

public class DatabaseManager {
    private static DatabaseManager instance;

    private DatabaseManager() {
        // Initialize database connection
    }

    public static synchronized DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }

    // Methods to interact with the database
}
