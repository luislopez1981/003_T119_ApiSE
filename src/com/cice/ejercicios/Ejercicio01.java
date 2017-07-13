package com.cice.ejercicios;

/**
 *
 * @author Formador
 */
public class Ejercicio01 {

    public static void main(String... args) {

        int contador = 0;

        String cadena = "Esto es una cadena de caracteres con muchas vocales";

        for (int i = 0; i < cadena.length(); i++) {

            char ch = cadena.toLowerCase().charAt(i);

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    contador++;
            }
            
            /*
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                contador++;
            }
            */
        }

        System.out.println("La cadena dada tiene " + contador + " vocales");

    }

}
