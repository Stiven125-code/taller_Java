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
public class Java13 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numero, cuadrado;

        numero = input.nextInt();
        cuadrado = numero * numero;
        System.out.println("El cuadrado del número es: " + cuadrado);
    }
}
