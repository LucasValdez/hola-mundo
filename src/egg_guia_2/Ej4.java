package egg_guia_2;

import java.util.Scanner;

public class Ej4 {

    /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en
    grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Convertir ºC en ºF.");
        System.out.println("Ingrese ºC.");
        int c = sc.nextInt(), f = (32 + (9 * c / 5));
        
        System.out.println(c + "ºC = " + f + "ºF.");
    }
    
}