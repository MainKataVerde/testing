package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double num12, num2, resultado;
        
        int hola = 12 ; 
        
        System.out.println(hola);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        num12= sc.nextDouble();
        System.out.println("Ingresa el segundo número: ");
        num2 = sc.nextDouble();
        resultado = num12 + num2;

        System.out.println("La suma de " + num12 + " y " + num2 + " es " + resultado + ".");
        sc.close();

    }
}