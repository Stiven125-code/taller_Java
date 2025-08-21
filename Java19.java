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
public class Java19 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double costo, pago, cambio;

        System.out.print("Ingrese el costo del producto: ");
        costo = input.nextDouble();

        System.out.print("Ingrese el pago recibido: ");
        pago = input.nextDouble();

        if (pago >= costo) {
            cambio = pago - costo;
            System.out.println("El cambio a entregar es: " + cambio);
        } else {
            System.out.println("El pago es insuficiente. Faltan " + (costo - pago));
        }
    }

}
