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
public class Java17 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int km;
        double millas, millasMarinas;

        System.out.println("Ingrese la distancia en kilómetros:");
        km = input.nextInt();

        // 1 milla terrestre = 1609 metros
        millas = (km * 1000.0) / 1609;

        // 1 milla marina = 1852 metros
        millasMarinas = (km * 1000.0) / 1852;

        System.out.println("La distancia en millas terrestres es: " + millas);
        System.out.println("La distancia en millas marinas es: " + millasMarinas);
    }
}
