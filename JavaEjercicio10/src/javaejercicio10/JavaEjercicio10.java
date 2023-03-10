/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package javaejercicio10;

import java.util.Scanner;

public class JavaEjercicio10 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num,suma, limite;
        
        System.out.println(" ingrese un valor limite positivo ");
        limite = leer.nextInt();
        
        suma = 0;
        
        do{
            System.out.println(" ingrese un numero");
            num = leer.nextInt();
            suma += num;
            
        }while (suma<= num);
        
        System.out.println( "la suma  " + suma + " para el limite positivo de " + limite);
               
          }
    
}
