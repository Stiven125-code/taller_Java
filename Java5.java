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
public class Java5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double v1, v2, v3, v4, v5, suma, media;

        System.out.print("Ingrese el primer valor: ");
        v1 = input.nextDouble();

        System.out.print("Ingrese el segundo valor: ");
        v2 = input.nextDouble();

        System.out.print("Ingrese el tercer valor: ");
        v3 = input.nextDouble();

        System.out.print("Ingrese el cuarto valor: ");
        v4 = input.nextDouble();

        System.out.print("Ingrese el quinto valor: ");
        v5 = input.nextDouble();

        suma = v1 + v2 + v3 + v4 + v5;
        media = suma / 5;

        System.out.println("La media de los cinco valores es: " + media);
    }
}
