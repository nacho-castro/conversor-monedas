package com.alura.challenge.main;

import com.alura.challenge.control.Conversion;
import com.alura.challenge.model.MonedaExchange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Maneja la API de ExchangeRate
        Conversion conversion = new Conversion();

        int opcion;
        double cantidad;
        Boolean flag = true;
        Scanner in = new Scanner(System.in);

        System.out.println("Bienvenido al Conversor de Monedas!");
        do{
            System.out.println(
                    "\n 1. Dólar >> Peso argentino" +
                    "\n 2. Peso argentino >> Dólar" +
                    "\n 3. Dólar >> Real brasileño" +
                    "\n 4. Real brasileño >> Dólar" +
                    "\n 5. Real brasileño >> Peso Argentino" +
                    "\n 6. Peso argentino >> Real brasileño" +
                    "\n 7. Salir");
            System.out.println(" ");
            System.out.print("Elija una opcion: ");
            opcion = in.nextInt();

            if(opcion >= 1 && opcion <=6){
                System.out.println(" ");
                System.out.print("Ingrese cantidad a convertir: ");
                cantidad = in.nextDouble();

                switch (opcion){
                    case 1:
                        conversion.calcularTotal(cantidad, "USD", "ARS");
                        break;
                    case 2:
                        conversion.calcularTotal(cantidad,"ARS", "USD");
                        break;
                    case 3:
                        conversion.calcularTotal(cantidad,"USD", "BRL");
                        break;
                    case 4:
                        conversion.calcularTotal(cantidad,"BRL", "USD");
                        break;
                    case 5:
                        conversion.calcularTotal(cantidad,"BRL", "ARS");
                        break;
                    case 6:
                        conversion.calcularTotal(cantidad,"ARS", "BRL");
                        break;
                }
            } else if(opcion == 7){
                System.out.println("Hasta luego!");
                flag = false;
            } else {
                System.out.println("Opcion desconocida! Vuelve a intentar.");
            }

        }while(flag);
    }
}
