/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;





/**
 *
 * @author cice
 */
public class Ejercicio05 {
    
    public static void main (String[] args) throws IOException {
 
            //método 1
            String num1;
            String num2;
            
            System.out.print("Introduzca un número... ");
            InputStreamReader lectura1 = new InputStreamReader(System.in);
            BufferedReader flujo1 = new BufferedReader(lectura1);
            
            num1 = flujo1.readLine();
            
            
            System.out.println("Introduzca otro número...");
           
            num2 = flujo1.readLine();
            
            
            
            System.out.println("El número menor es: " + Math.min(Integer.parseInt(num2),(Integer.parseInt(num1)) )+ "; y el número mayor es: " + Math.max(Integer.parseInt(num1),(Integer.parseInt(num2))));
            
            
            //Método 2
            
            Scanner sc = new Scanner (System.in);
            
            System.out.print("Introduce un número ");
            
            int c = sc.nextInt();
            
            System.out.println("Introduce otro número");
            
            int d = sc.nextInt();
            
            System.out.println("El número menor es: " + Math.min(c, d) + ", y el número mayor es: " + Math.max(c, d));
            
            
            
         
        }
              
}

