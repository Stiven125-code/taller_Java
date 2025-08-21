/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller_java;

import java.util.Scanner;
/**
 *
 * @author User
 */
public class Taller_Java {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here       
       
         Scanner input = new Scanner(System.in);
          int num, cuadrado, cubo;

        System.out.print("Ingrese un número: ");
        num = input.nextInt();

        // Cálculos
        cuadrado = num * num;
        cubo = num * num * num;

        // Resultados
        System.out.println("El cuadrado del número es: " + cuadrado);
        System.out.println("El cubo del número es: " + cubo);
    }   
}
