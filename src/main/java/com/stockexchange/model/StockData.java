package com.stockexchange.model;

public class StockData {
    private String name;
    private double openPrice;
    private double highPrice;
    private double lowPrice;
    private double marketCap;
    private double revenue;
    private double profit;
    private double netWorth;
    private double annualGrowth;

    // Getters and Setters

    // Constructor
    public StockData(String name, double openPrice, double highPrice, double lowPrice) {
        this.name = name;
        this.openPrice = openPrice;
        this.highPrice = highPrice;
        this.lowPrice = lowPrice;
    }

    // Methods to calculate new features
    public void calculateMarketShare(double marketCap, double totalMarketCap) {
        this.marketCap = marketCap / totalMarketCap;
    }

    public void calculateAnnualGrowth() {
        this.annualGrowth = (highPrice - lowPrice) / lowPrice * 100;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public double getAnnualGrowth() {
        return annualGrowth;
    }

    public void setAnnualGrowth(double annualGrowth) {
        this.annualGrowth = annualGrowth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
