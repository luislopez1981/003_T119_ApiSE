/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.apise.string;

/**
 *
 * @author Formador
 */
public class PruebasString {

    public static void main(String[] args) {

        boolean esMayor = 2 > 4;
        boolean esIgual = 2 == 3 - 1;

        boolean comparaValoresBool = (esMayor == esIgual);

        boolean comparaChars = 'a' != 'A';

        System.out.println(esMayor + " " + esIgual + " " + comparaValoresBool + " " + comparaChars);

        String nombre = new String("Gustuvu");
        String otroNombre = "gustavo";

        boolean nombresIguales = (nombre == otroNombre);

        System.out.println(nombresIguales);

        StringBuilder sb = new StringBuilder();
        sb.append("gustavo");

        StringBuilder sb2 = new StringBuilder();
        sb2.append("gustavu");

        System.out.println(sb == sb2);

        System.out.println(nombre.equalsIgnoreCase(otroNombre));

        System.out.println(nombre.lastIndexOf("u"));
        System.out.println(nombre.indexOf("u"));

        String cadena = "ggamco@gmail.com";
        int ps = cadena.indexOf("@");
        System.out.println(cadena.substring(++ps));
        System.out.println(cadena.substring(0, --ps));

        System.out.println(cadena.replace('@', ' '));

        cadena = "                cadena con espacios         intermedios y finales             ";
        System.out.println(cadena.length());

        System.out.println(cadena);
        System.out.println(cadena.trim());

        cadena = String.valueOf(esIgual) + " esto es otro dato mas";

        System.out.println(2 + (4 + (7 * 7)) + 3);
        
        cadena = "Esto//es.una.cadena.de.caracteres.con.muchas.palabras";
        
        String[] data = cadena.split("//");
        
        for (String s : data) {
            System.out.println(s);
        }
    }

}
