package com.ejercicio6;

import java.io.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        try {
            InputStream fileIn = new FileInputStream("src/com/ejercicio6/fileIn.txt");
            PrintStream fileOut = new PrintStream("src/com/ejercicio6/fileOut.txt");

            try {
                copyFile(fileIn, fileOut);
                System.out.println("Se ha copiado el fichero");
            } catch (RuntimeException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void copyFile(InputStream fileIn, PrintStream fileOut) throws RuntimeException{
        try {
            int byteIn;
            while ((byteIn = fileIn.read()) != -1) {
                fileOut.write(byteIn);
            }
            fileIn.close();
            fileOut.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
