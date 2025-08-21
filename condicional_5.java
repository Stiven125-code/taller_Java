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
public class condicional_5 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;

        System.out.print("Escriba el número: ");
        numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es PAR");
        } else {
            System.out.println("El número es IMPAR");
        }
    }
}
