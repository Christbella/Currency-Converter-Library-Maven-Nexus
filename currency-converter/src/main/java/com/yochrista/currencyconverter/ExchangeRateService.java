package com.yochrista.currencyconverter;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.google.gson.Gson;
import java.io.IOException;

public class ExchangeRateService {

    /**
     * Fetches exchange rate data for the specified base currency.
     * 
     * @param baseCurrency The base currency code.
     * @return ExchangeRateData object containing exchange rates.
     */
    ExchangeRateData getExchangeRates(String baseCurrency) {
        String apiUrl = "https://api.exchangerate-api.com/v4/latest/" + baseCurrency;
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(apiUrl);

            CloseableHttpResponse response = httpClient.execute(request);
            String json = EntityUtils.toString(response.getEntity());

            return new Gson().fromJson(json, ExchangeRateData.class);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Gets the exchange rate from one currency to another.
     * 
     * @param fromCurrency The currency code to convert from.
     * @param toCurrency   The currency code to convert to.
     * @return The exchange rate.
     */
    public double getExchangeRate(String fromCurrency, String toCurrency) {
        ExchangeRateData data = getExchangeRates(fromCurrency);
        if (data != null && data.getRates().containsKey(toCurrency)) {
            return data.getRates().get(toCurrency);
        } else {

            return -1; // throwing an exception would be better
        }
    }
}
