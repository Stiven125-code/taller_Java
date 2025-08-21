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
public class Java10 {
     private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String marca, modelo, resultado;

        System.out.print("Ingrese la marca: ");
        marca = input.nextLine();

        System.out.print("Ingrese el modelo: ");
        modelo = input.nextLine();

        resultado = modelo + " " + marca;

        System.out.println("El modelo seguido de la marca es: " + resultado);
    }
}
