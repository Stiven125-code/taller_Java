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
public class condicional_6 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int nota;

        System.out.print("Ingrese la nota: ");
        nota = input.nextInt();

        if (nota >= 30) {
            System.out.println("Aprobado");
        } else if (nota < 20) {
            System.out.println("Reprobado");
        } else {
            System.out.println("En recuperación");
        }
    }
}
