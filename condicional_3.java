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
public class condicional_3 {
   private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double compra, descuento, precioFinal;

        System.out.print("Ingrese el valor de la compra: ");
        compra = input.nextDouble();

        if (compra > 150000) {
            descuento = compra * 0.10;
            precioFinal = compra - descuento;
            System.out.println("Su compra aplica al descuento.");
            System.out.println("Precio con descuento: " + precioFinal);
        } else {
            System.out.println("Su compra no aplica al descuento.");
            System.out.println("Total a pagar: " + compra);
        }
    }
}
