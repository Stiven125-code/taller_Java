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
public class condicional_7 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2;

        System.out.println("Ingrese el primer número:");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = input.nextInt();

        if (num1 > num2) {
            System.out.println("El primer número es mayor");
        } else if (num1 < num2) {
            System.out.println("El segundo número es mayor");
        } else {
            System.out.println("Los números son iguales");
        }
    }
}
