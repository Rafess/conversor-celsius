package com.letscode.conversor;

public class Main {
    public static void main(String[] args) {
        final float CONVERSOR_CESIUS_FARENHEIT_RA= 1.8f;
        float valorCelcius = 18f;
        float valorConvertido = valorCelcius * CONVERSOR_CESIUS_FARENHEIT_RA;
        System.out.printf("%.2fºC equivalem a %.2fºF %n", valorCelcius, (valorConvertido + 32));
        System.out.printf("%.2fºC equivalem a %.2fºK %n", valorCelcius, (valorCelcius + 273.15));
        System.out.printf("%.2fºC equivalem a %.2fºRe %n", valorCelcius, (valorCelcius * 0.8));
        System.out.printf("%.2fºC equivalem a %.2fºRe", valorCelcius, (valorConvertido + 491));
    }
}
