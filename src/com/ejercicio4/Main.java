package com.ejercicio4;

public class Main {
    public static void main(String[] args) {
        SmartDevice smartphone = new SmartPhone("Apple", "iPhone X", "Rojo", 1000.0f, 5.0f, "IOS");
        SmartDevice smartWatch = new SmartWatch("Xiaomi", "Watch", "Azul", 200.0f, "Cuero");
        System.out.println(smartphone);
        System.out.println(smartWatch);
    }
}
