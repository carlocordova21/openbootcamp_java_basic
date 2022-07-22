package com.ejercicio2;

public class Main {
    public static void main(String[] args) {
        float precio = 1000;
        float precioIVA = precioIVA(precio);
        System.out.println("El precio con IVA es: " + precioIVA);
    }

    public static float precioIVA(float precio) {
        return (float) (precio * 1.18);
    }
}
