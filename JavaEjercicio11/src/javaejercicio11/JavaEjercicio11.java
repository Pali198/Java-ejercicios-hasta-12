/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package javaejercicio11;

import java.util.Scanner;


public class JavaEjercicio11 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);        
        System.out.println(" ingrese dos numeros positivos ");
        int num,num2;           
        num= leer.nextInt();
        num2= leer.nextInt();
        String salir = " ";
        int opcion= 0;
               
    do{
        
        System.out.println("--menu--");
        System.out.println("1: sumar");
        System.out.println("2: restar");
        System.out.println("3: multiplicar");
        System.out.println("4: dividir");
        System.out.println("5: salir");
        opcion = leer.nextInt();
        switch(opcion){
            
            case 1:
                System.out.println(" la suma de los numeros es: " + (num+num));
                break;
            case 2:
                System.out.println(" la resta de los numero es: " + (num-num2));
                break;
            case 3:
                System.out.println(" la multiplicacion de los numeros es: " + (num*num2));
                break;
            case 4:
                System.out.println(" la division de los numeros es: " + (num/num2));
                break;
            case 5:
                System.out.println(" ¿desea salir del menu ? (s/n)");
                salir = leer.next();
                break;
            default:
                System.out.println(" opcion no valida, vuelva a ingresa una opcion");                  
        }
        } while ((salir.equals("n")) && (opcion >= 1 || opcion <= 5));
        
    }
          
}
