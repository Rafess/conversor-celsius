package com.letscode.conversor;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner celsiusScanner =  new Scanner(System.in);
    // a linha abaixo é a assinatura do projeto:
    // nela temos a visibilidade(public), indicador de função estática(quando aplicavel), por default ela nao é static
    // tipo de retorno(se nao retorna nada usa void)
    // nome da função (main)
    // argumentos da função, string args seria
    private static final float MULTIPLIER_CONVERTER= 1.8f;
    public static void main(String[] args) {

        // All final must be in UPPER_SNAKE_CASE
        System.out.print("Qual temperatura deseja converter?");// Usar metodo de entrada e fazer a quebra do codigo a seguir:
        calculateToFarenheit();
        final float KELVIN_VARIATION = 273.15f;
        final float RE_MULTIPLIER = 0.8f;
        final float RA_VARIATION = 491f;
//        System.out.printf("%.2fºC equivalem a %.2fºF %n", celsiusValue, (valorConvertido + FARENHEIT_VARIATION));
//        System.out.printf("%.2fºC equivalem a %.2fºK %n", celsiusValue, (celsiusValue + KELVIN_VARIATION));
//        System.out.printf("%.2fºC equivalem a %.2fºRe %n", celsiusValue, (celsiusValue * RE_MULTIPLIER));
//        System.out.printf("%.2fºC equivalem a %.2fºRa", celsiusValue, (valorConvertido + RA_VARIATION));
    }

    private static void calculateToFarenheit() {
        float celsius = celsiusScanner.nextFloat();
        final float FARENHEIT_VARIATION = 32f;
        float convertedValue = celsius * MULTIPLIER_CONVERTER;
        System.out.printf("%.2fºC equivalem a %.2fºF %n", celsius, (convertedValue + FARENHEIT_VARIATION));
    }

}
