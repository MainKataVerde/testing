package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double numero1, num2, resultado;
        
        int hola = 12 ; 
        
        System.out.println((hola)+12);
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número: ");
        numero1= sc.nextDouble();
        System.out.println("Ingresa el segundo número: ");
        num2 = sc.nextDouble();
        resultado = num12 + num2;

        System.out.println("La suma de " + numero1 + " y " + num2 + " es " + resultado + ".");
        sc.close();

    }
}
