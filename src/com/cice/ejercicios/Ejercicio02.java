/*
 * Mostrar porpantalla todas las posiciones en las que aparace la letra 'a' en una cadena dada
 * Cadena -> "Esto es una cadena de caracteres muy larga"
 */
package com.cice.ejercicios;

/**
 *
 * @author Formador
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        //cadena para analizar
        String cadena = "asto es una cadena de caracteres muy larga";

        int pos = 0;
/*
        while (pos >= 0) {

            if (pos == 0) {
                pos = cadena.indexOf("a", pos);
                System.out.println("Se ha encontrado la letra a en la posición: " + pos);
                pos += 1;
            } else {
                pos = cadena.indexOf("a", ++pos);
                System.out.println("Se ha encontrado la letra a en la posición: " + pos);
            }

        }
*/
        
        
        do {
            pos = cadena.indexOf("a", pos);
            
            if( pos != -1){
               System.out.println("Se ha encontrado la letra a en la posición: " + pos); 
            }
            
            pos += 1;
        } while (pos > 0);
        
        
 /*
        for (int i = 0; i < 2; i++) {
            System.out.println(++pos); //1 //3
            System.out.println(pos++); //1 //3
        }
        
        System.out.println(pos); //4
         */
 /*
        int posicion = 0;
        while (posicion >= 0) {
            if (posicion == 0) {
                posicion = cadena.indexOf("a", posicion);
                //Almaceno la posicion donde ha encontrado la letra 'a' y la almaceno en la variable posicion        
                System.out.println("Se ha encontrado la letra 'a' en la posicion " + posicion);
                posicion += 1; 
                //Si la cadena fuera "asto es una cadena de caracteres muy larga"     
            } else {
                posicion = cadena.indexOf("a", ++posicion);
                //posicion+1 es lo mismo que ++posicion (incremento en 1 la posicion)            
                //Si yo pusiera posicion++, si lo pongo delante antes de ver el valor de posicion ya le incrementa uno, y sino hasta que no vea el valor de posicion y ejecute la funcion no va a hacer el incremento            
                //Si pusiera posicion++ me saldría todo el rato posicion=10, primero se analiza y luego se suma        
                System.out.println("Se ha encontrado la letra 'a' en la posicion " + posicion);
            }
        }
*/
    }
}
