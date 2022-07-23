package com.ejercicio6;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numero = 20;
        try {
            int resultado = dividePorCero(numero);
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

    public static int dividePorCero(int numero) throws ArithmeticException {
        int resultado;
        try {
            resultado = numero / 0;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
        return resultado;
    }
}
