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
public class Java11 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double cateto1, cateto2, hipotenusa;

        System.out.print("Ingrese el primer cateto: ");
        cateto1 = input.nextDouble();

        System.out.print("Ingrese el segundo cateto: ");
        cateto2 = input.nextDouble();

        hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        System.out.println("La hipotenusa del triángulo es: " + hipotenusa);
    }
}
