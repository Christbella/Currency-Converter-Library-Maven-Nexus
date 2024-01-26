package com.yochrista.currencyconverter;

public class CurrencyConverter {

    private ExchangeRateService exchangeRateService;

    // Constructor
    public CurrencyConverter(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    /**
     * Converts an amount from one currency to another.
     * @param amount The amount to convert.
     * @param fromCurrency The currency code to convert from.
     * @param toCurrency The currency code to convert to.
     * @return The converted amount.
     */
    public double convertCurrency(double amount, String fromCurrency, String toCurrency) {
        double rate = exchangeRateService.getExchangeRate(fromCurrency, toCurrency);
        return amount * rate;
    }
}
