package com.yochrista.currencyconverter;

import java.util.Map;

public class ExchangeRateData {
    private String base;
    private String date;
    private long time_last_updated;
    private Map<String, Double> rates;

    // Constructors, getters, and setters for each field

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getTimeLastUpdated() {
        return time_last_updated;
    }

    public void setTimeLastUpdated(long timeLastUpdated) {
        this.time_last_updated = timeLastUpdated;
    }

    public Map<String, Double> getRates() {
        return rates;
    }

    public void setRates(Map<String, Double> rates) {
        this.rates = rates;
    }
}
