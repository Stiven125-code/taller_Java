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
public class Java16 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pulgadas, pies, pulgadasConvertidas;
        double yardas;

        System.out.println("Ingrese la cantidad en pulgadas:");
        pulgadas = input.nextInt();
        System.out.println("Ingrese la cantidad en pies:");
        pies = input.nextInt();

        // Cálculos
        yardas = (double) pulgadas / 36;   // 36 pulgadas = 1 yarda
        pulgadasConvertidas = pies * 12;   // 1 pie = 12 pulgadas

        // Resultados
        System.out.println("La cantidad en yardas es: " + yardas);
        System.out.println("La cantidad de pulgadas equivalentes a los pies ingresados es: " + pulgadasConvertidas);
    }
}
