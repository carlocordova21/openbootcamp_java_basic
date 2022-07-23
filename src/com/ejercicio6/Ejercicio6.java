package com.ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio6 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                Integer remove = lista.remove(i);
            }
        }

        System.out.println(Arrays.toString(lista.toArray()));
    }
}
