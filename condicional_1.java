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
public class condicional_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numero;

        System.out.print("Escribe un número: ");
        numero = input.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("No es positivo");
        }
    }
  
}
