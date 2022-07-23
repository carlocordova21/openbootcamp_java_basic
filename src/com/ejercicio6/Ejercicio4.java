package com.ejercicio6;

import java.util.Vector;

public class Ejercicio4 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(1000);
        //Si gregamos 1001 elementos al vector para superar su capacidad inicial
        for(int i = 0; i < 1001; i++) {
            vector.add(i+1);
        }
        //La capacidad del vector se duplica
        System.out.println("Capacidad del vector: " + vector.capacity());
    }
}
