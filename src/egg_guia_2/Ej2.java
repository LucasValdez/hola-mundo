package egg_guia_2;

import java.util.Scanner;

public class Ej2 {

    /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo 
    muestre por pantalla.
    */
    public static void main(String[] args) {
         Scanner sc = new Scanner (System.in);
         System.out.println("Escriba su nombre.");
         String name = sc.next();
         
         System.out.println("Hola " + name + ". Sos un Crack.");
        
    }
    
}
