package com.yochrista.currencyconverterapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.yochrista.currencyconverter.CurrencyConverter;
import com.yochrista.currencyconverter.ExchangeRateService;

@Configuration
public class AppConfig {

    @Bean
    public CurrencyConverter currencyConverter() {
        ExchangeRateService service = new ExchangeRateService(); // Adjust as needed
        return new CurrencyConverter(service);
    }
}
