/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_java;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Java15 {
     private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2, temp;

        System.out.println("Ingrese el primer número:");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = input.nextInt();

        // Intercambio de valores
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Después del intercambio:");
        System.out.println("El valor del primer número es: " + num1);
        System.out.println("El valor del segundo número es: " + num2);
    }

}
