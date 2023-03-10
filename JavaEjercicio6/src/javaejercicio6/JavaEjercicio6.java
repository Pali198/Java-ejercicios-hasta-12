/*
 Crear un programa que dado un numero determine si es par o impar.
 */
package javaejercicio6;

import java.util.Scanner;


public class JavaEjercicio6 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num;
        System.out.println(" ingrese un numero ");
        num = leer.nextInt();
        
        
        if (num%2==0){
            System.out.println(" el numero ingresado es par ");
                      
        }  else {
            System.out.println(" el numero ingresado es impar ");
            
        }        
              
    }
    
}
