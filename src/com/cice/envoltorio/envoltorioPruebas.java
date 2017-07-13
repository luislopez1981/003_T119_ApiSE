/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.envoltorio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 *
 * @author cice
 */
public class envoltorioPruebas {
    
    public static void main (String [] args) throws FileNotFoundException, IOException {
        
        Integer in = new Integer(100); //declarada e inicializada bajo instancia.
        
        System.out.println(in);
        
        Integer k = 200; //declarada e inicicializada implícitamente
        
        System.out.println(k);
        
        String cadena1 = "1234";
        
        int j=Integer.parseInt(cadena1); //conviertes una cadena de caracteres en un entero 
                                         //que declaras e inicializas en la misma sentencia
        
        System.out.println(j+k);
        
        
//        PrintStream ps = new PrintStream("h:\\datos.txt");
//        
//        ps.println("esto es una cadena super larga mientras estudio");
//        
//        ps.close();
        
        
        String texto;
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader caracteres = new BufferedReader(flujo);
        
        System.out.println("Introduzca una o varias palabras... ");
        texto = caracteres.readLine();
        
        PrintStream salida = new PrintStream(System.out);
        salida.println("Los valores tecleados son: " + texto);
        
        
        
        
        
        
        
        
    }   
    
}
