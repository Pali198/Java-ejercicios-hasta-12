/*
1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package javaejercicio1;

import java.util.Scanner;


public class JavaEjercicio1 {

   
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        
        int num1,num2,suma;
        System.out.println(" ingrese un  numero entero ");
        num1 = leer.nextInt();
        System.out.println(" ingrese otro numero entero ");
        num2 = leer.nextInt();       
        suma=num1+num2;              
        System.out.println(" la suma de los numeros es " + suma );
                  
    }
    
}
