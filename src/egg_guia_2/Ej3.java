package egg_guia_2;

import java.util.Scanner;

public class Ej3 {

    /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y 
    después toda en minúsculas. 
    Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Escriba una frase.");
        String frase = sc.nextLine();
        
        System.out.println("---------------------------------");
        System.out.println("Asi queda la frase en minisculas.");
        System.out.println(frase.toLowerCase());
        System.out.println("---------------------------------");
        System.out.println("Asi queda la frase en MAYUSCULAS.");
        System.out.println(frase.toUpperCase());
       
    }
    
}
