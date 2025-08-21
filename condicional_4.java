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
public class condicional_4 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int temperatura;

        System.out.print("Ingrese la temperatura: ");
        temperatura = input.nextInt();

        if (temperatura > 35) {
            System.out.println("⚠️ Alerta: temperatura alta");
        } else {
            System.out.println("Temperatura baja");
        }
    }
}
