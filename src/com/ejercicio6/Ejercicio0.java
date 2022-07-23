package com.ejercicio6;

public class Ejercicio0 {
    public static void main(String[] args) {
        //Escribe el código que devuelva una cadena al revés.
        String cadena = "hola mundo";
        String textoInvertido = reverse(cadena);
        System.out.println(textoInvertido);
    }

    public static String reverse(String texto) {
        StringBuilder textoInvertido = new StringBuilder();
        for(int i = 0; i < texto.length(); i++) {
            int index = texto.length() - i - 1;
            char temp = texto.charAt(index);
            textoInvertido.append(temp);
        }
        return textoInvertido.toString();
    }
}
