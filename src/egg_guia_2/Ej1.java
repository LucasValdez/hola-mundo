package egg_guia_2;

import java.util.Scanner;

public class Ej1 {

    /*
    Escribir un programa que pida dos números enteros por teclado y calcule
    la suma de los dos. El programa deberá después mostrar el resultado de la
    suma
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Escriba 2 numeros para calcular una suma.");
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        
        System.out.println("La suma de los numeros es: " + (num + num2));
    }

}
