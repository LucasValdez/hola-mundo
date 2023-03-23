package egg_guia_2;

import java.util.Scanner;

public class Ej5 {

    /* Escribir un programa que lea un número entero por teclado y muestre por 
    pantalla el doble, el triple y la raíz cuadrada de ese número.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un numero.");
        int num = sc.nextInt();
        
        System.out.println("El doble de " + num + " es: " + (num*2));
        System.out.println("El triple de " + num + " es: " + (num*3));
        System.out.println("La raiz cuadrada de " + num + " es: " + Math.sqrt(num));
    }
    
}