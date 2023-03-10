/*
/Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package javaejercicio9;

import java.util.Scanner;

public class JavaEjercicio9 {

 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase, longi;
        
      System.out.println(" Ingrese una frase o palabra ");
      frase = leer.nextLine().toUpperCase();
      longi= frase.substring(0,1);
      
      if(longi.equals("A")){
          System.out.println(" CORRECTO ");
      }else{
          System.out.println(" INCORRECTO ");
                    
      }
             
    }
    
}
