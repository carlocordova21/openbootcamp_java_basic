package com.ejercicio6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ejercicio5 {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("CSGO");
        arrayList.add("League of Legends");
        arrayList.add("Overwatch");
        arrayList.add("Dota 2");

        System.out.println("1. ArrayList:");
        for (String string : arrayList) {
            System.out.println(string);
        }
        System.out.println("-----------------------------------------------------");

        System.out.println("2. LinkedList:");
        List<String> linkedList = new LinkedList<>(arrayList);
        for(String string : linkedList) {
            System.out.println(string);
        }
    }
}
