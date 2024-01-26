package com.yochrista.currencyconverter;

public class App {
    public static void main(String[] args) {
        String curr = "USD";
        ExchangeRateService exchangeRateService = new ExchangeRateService();
        ExchangeRateData data = exchangeRateService.getExchangeRates(curr);

        // jst to try out the implementation
        if (data != null) {
            System.out.println("Base Currency: " + data.getBase());
            data.getRates().forEach((currency, rate) -> System.out.println(currency + ": " + rate));
        } else {
            System.out.println("Failed to fetch exchange rates.");
        }
    }
}
