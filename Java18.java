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
public class Java18 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double centimetros, pulgadas;

        System.out.println("Ingrese la cantidad en centímetros:");
        centimetros = input.nextDouble();

        // Conversión correcta
        pulgadas = centimetros / 2.54;

        System.out.println("La cantidad en pulgadas es: " + pulgadas);
    }
}
