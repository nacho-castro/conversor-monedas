package com.alura.challenge.model;

import com.alura.challenge.control.Conversion;

public class Moneda {
    private String base;
    private String target;
    private double rate;

    public Moneda(MonedaExchange monedaExchange){
        this.base = monedaExchange.base_code();
        this.target = monedaExchange.target_code();
        this.rate = monedaExchange.conversion_rate();
    }

    public double convertir(double cantidad){
        double total = cantidad * this.rate;
        System.out.println("------------------------------------");
        System.out.printf("%.2f [%s] >>> %.2f [%s]%n", cantidad, this.base, total, this.target);
        System.out.println("------------------------------------");
        return total;
    }
}
