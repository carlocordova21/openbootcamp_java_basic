package com.ejercicio6;

import java.util.Vector;

public class Ejercicio3 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(4,0);
        //Agregamos elementos al vector
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        //Eliminamos 2do y 3er elemento del vector
        vector.remove(2);
        vector.remove(1);
        //Mostramos el vector
        System.out.println(vector);
    }
}
