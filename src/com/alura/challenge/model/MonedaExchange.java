package com.alura.challenge.model;

public record MonedaExchange(String base_code, String target_code, double conversion_rate) {
    //La clase record obtiene del JSON la cotizacion de dos monedas elegidas y sus respectivos codigos
}
