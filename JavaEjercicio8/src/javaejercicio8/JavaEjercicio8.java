/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package javaejercicio8;

import java.util.Scanner;


public class JavaEjercicio8 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String frase;
        System.out.println(" ingrese una frase de 8 caracteres ");
        frase = leer.nextLine();
        
        if (frase.length()==8){
            System.out.println(" la frase ingresada esta correcta " + frase);
            
        }else {
            System.out.println(" la frase no es la correcta " + frase);
                                  
        }
                        
    }
    
}
