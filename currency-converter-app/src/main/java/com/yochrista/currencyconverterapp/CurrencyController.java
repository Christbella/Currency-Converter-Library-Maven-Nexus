package com.yochrista.currencyconverterapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.yochrista.currencyconverter.CurrencyConverter;

@RestController
public class CurrencyController {

    @Autowired
    private CurrencyConverter currencyConverter;

    @GetMapping("/convert")
    public String convertCurrency(@RequestParam String from, @RequestParam String to, @RequestParam double amount) {
        double convertedAmount = currencyConverter.convertCurrency(amount, from, to);
        return "Converted amount: " + convertedAmount;
    }
}
