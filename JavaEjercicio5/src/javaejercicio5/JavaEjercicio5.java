/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package javaejercicio5;

import java.util.Scanner;


public class JavaEjercicio5 {

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int num,doble,triple;
        double raiz;
        
        System.out.println(" ingrese un numero entero ");
        num = leer.nextInt();
        
        doble = num * 2;
        triple = num * 3;
        raiz = Math.sqrt(num);
        
        System.out.println(" El numero ingresado es " + num);
        System.out.println(" El doble del numero ingresado es " + doble);
        System.out.println(" el triple del numero ingresado es " + triple);
        System.out.println(" la raiz del numero ingresado es " + raiz);
                     
    }
    
}
