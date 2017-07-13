/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.Stringbuilder;

/**
 *
 * @author NYL
 */
public class PruebasStringBuilder {
    
public static void main (String...args){
    
    StringBuilder sb = new StringBuilder ();
    
    sb.append("Esto es una porción de cadena. ");
    System.out.println(sb);
    
    sb.append("Esto es otra porción. ");
    System.out.println(sb);
    
    sb.insert(0, "Cadena anterior a las porciones.");
    System.out.println(sb);
    
    sb.replace(0, 6, "Es");
    System.out.println(sb);
    
    sb.delete(0, 4);
    System.out.println(sb);
    
    
            
    
}
}
