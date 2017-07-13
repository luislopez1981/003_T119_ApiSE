package com.cice.ejercicios;

/**
 *
 * @author NYL
 */
public class Ejercicio03 {

    public static void main(String... args) {

        StringBuilder sb = new StringBuilder("Texto donde se insertarán barras delante de espacios");

        int pos = sb.indexOf(" ");

        
        while (pos != -1){
           sb.insert(pos, "/");
           pos = sb.indexOf(" ", pos+2);
        }
            System.out.println(sb);
//        do {
//            if (pos == 0) {
//
//            pos = sb.indexOf(" ");
//            
//                if (pos != -1) {
//                    sb.insert(pos, "/");
//                    pos +=2;
//                    
//                }else{
//                    pos = sb.indexOf(" ", pos);
//                    
//                }
//            }System.out.println(sb);
//
//        } while (pos != -1);
            
    }
}


