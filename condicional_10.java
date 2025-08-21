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
public class condicional_10 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int temperatura;

        System.out.println("Ingrese la temperatura en °C:");
        temperatura = input.nextInt();

        if (temperatura < 0) {
            System.out.println("Congelado");
        } else {
            if (temperatura <= 30) {
                System.out.println("Templado");
            } else {
                System.out.println("Caliente");
            }
        }
    }
}
