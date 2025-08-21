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
public class Java3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, residuo;
        double cociente;

        System.out.print("Ingrese el primer número: ");
        num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = input.nextInt();

        cociente = (double) num1 / num2; // división real
        residuo = num1 % num2;           // módulo

        System.out.println("El cociente real es: " + cociente);
        System.out.println("El residuo es: " + residuo);
    }
}
