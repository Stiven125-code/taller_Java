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
public class condicional_9 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tiempo, costo, horasExtra;

        System.out.println("Ingrese el tiempo de horas:");
        tiempo = input.nextInt();

        if (tiempo <= 2) {
            costo = 5000;
            System.out.println("Total a pagar: " + costo);
        } else {
            horasExtra = tiempo - 2;
            costo = 5000 + horasExtra * 2000;
            System.out.println("Total a pagar: " + costo);
        }
    }
}
