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
public class Java6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, suma;

        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();

        suma = num1 + num2;

        System.out.println("La suma de los números es: " + suma);
    }    
}
