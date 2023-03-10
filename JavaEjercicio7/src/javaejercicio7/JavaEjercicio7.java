/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package javaejercicio7;

import java.util.Scanner;


public class JavaEjercicio7 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
       System.out.println(" ingrese una frase ");
       
       String frase = leer.nextLine();
       
       if(frase.equals(" EUREKA ")) {
           System.out.println(" la frase ingresada es la correcta " + frase);
     
       }else{
           System.out.println(" la frase ingresada no es la correcta " + frase);
           
       }            
        
       
    }
    
}
