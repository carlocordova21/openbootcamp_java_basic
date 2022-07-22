package com.ejercicio3;

public class Main {
    public static void main(String[] args) {
        String[] nombres = {"Andre", "Sofia", "Juan", "Pedro", "Maria"};

        StringBuilder salida = new StringBuilder();
        for (String nombre : nombres) {
            salida.append(nombre).append(" ");
        }
        System.out.println(salida);
    }
}
