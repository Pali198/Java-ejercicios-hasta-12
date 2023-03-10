/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/
package javaejercicio4;

import java.util.Scanner;


public class JavaEjercicio4 {

   
    public static void main(String[] args) {
        
     Scanner leer = new Scanner(System.in);
     
     double gradosc,gradosf; 
     System.out.println("Ingrese grados centigrados ");
     gradosc = leer.nextDouble();
     
     gradosf = 32 + (9*gradosc/5);
     
     System.out.println(" la equivalencia entre grados celsius " + gradosc + " y grados faranheit es " + gradosf);
         
    }
    
}
