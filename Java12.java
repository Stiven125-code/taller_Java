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
public class Java12 {
   private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c, p, area;

        System.out.print("Ingrese lado a: ");
        a = input.nextDouble();

        System.out.print("Ingrese lado b: ");
        b = input.nextDouble();

        System.out.print("Ingrese lado c: ");
        c = input.nextDouble();

        // Semiperímetro
        p = (a + b + c) / 2;

        // Fórmula de Herón
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("El área del triángulo es: " + area);
    } 
}
