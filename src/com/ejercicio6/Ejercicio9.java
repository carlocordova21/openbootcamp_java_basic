package com.ejercicio6;

import netscape.javascript.JSObject;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio9 {
    public static void main(String[] args) {


        try {
            InputStream fileIn = new FileInputStream("src/com/ejercicio6/credenciales.txt");
            PrintStream fileOut = new PrintStream("src/com/ejercicio6/credenciales_output.txt");

            try {
                editFileUser(fileIn, fileOut);
                System.out.println("Se ha modificado el usuario del fichero");
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void editFileUser(InputStream fileIn, PrintStream fileOut) throws RuntimeException{
        try {
            //Obtenemos el contenido del fichero en bytes
            byte[] bytesIn = fileIn.readAllBytes();
            fileIn.close();
            //Convertimos bytes en string
            String textIn = new String(bytesIn, StandardCharsets.UTF_8);

            //Obtenemos un map con username y password
            Map<String, String> mapUser = getUser(textIn);

            //Lista de programas
            ArrayList<String> programas = new ArrayList<>(Arrays.asList("Programa1", "Programa2", "Programa3"));

            //Escribimos el resultado en el archivo de salida
            String textOut = "El username: " + mapUser.get("username") +
                    " con password: " + mapUser.get("password") +
                    ", es administrador de los siguientes programas: " +
                    Arrays.toString(programas.toArray());
            fileOut.write(textOut.getBytes());
            fileOut.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Map<String, String> getUser(String texto) {
        String editText = texto;
        editText = editText.replace(System.getProperty("line.separator"), "");
        editText = editText.replace(" ", "");

        String fieldUsername = "username";
        String fieldPassword = "password";
        int indexUsername = editText.indexOf(fieldUsername+":");
        int indexPassword = editText.indexOf(fieldPassword+":");

        String usuario;
        String password;

        if(indexUsername < indexPassword) {
            usuario = editText.substring(fieldUsername.length() + 1, indexPassword);
            password = editText.substring(indexPassword + fieldPassword.length() + 1);
        } else {
            usuario = editText.substring(fieldPassword.length() + 1, indexUsername);
            password = editText.substring(indexUsername + fieldUsername.length() + 1);
        }

        Map<String, String> mapUser = new HashMap<>();
        mapUser.put(fieldUsername, usuario);
        mapUser.put(fieldPassword, password);

        return mapUser;
    }
}
