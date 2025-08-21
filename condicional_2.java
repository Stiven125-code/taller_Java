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
public class condicional_2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int edad;

        System.out.print("Ingrese la edad: ");
        edad = input.nextInt();

        if (edad >= 18) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona es menor de edad");
        }
    }
}


