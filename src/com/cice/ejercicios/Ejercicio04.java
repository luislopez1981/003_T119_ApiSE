/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.ejercicios;

/**
 *
 * @author NYL
 */
public class Ejercicio04 {

    public static void main(String... args) {

    int a = aleatorioEnRango(100, 0);
    int b = aleatorioEnRango(100, 0);
        System.out.println("a: "+ a);    
        System.out.println("b: "+ b);
        
    int resultado = Math.min(a, b);
    for (int i = (Math.min(a, b)+1); i<=Math.max(a, b); i++){
        resultado = resultado + i;
    }System.out.println("resultado: "+ resultado);
    
    
    }
    
    public static int aleatorioEnRango(int mayor, int menor) {
        int resultado = 0;

        resultado = (int) Math.floor(Math.random() * (mayor - menor + 1) + menor);
        return resultado;

    }
}
