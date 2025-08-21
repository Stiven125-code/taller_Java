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
public class Java2 {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radio, perimetro, area;

        System.out.print("Ingrese el radio: ");
        radio = input.nextDouble();

        // cálculos
        perimetro = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);

        // resultados
        System.out.println("El perímetro de la circunferencia es: " + perimetro);
        System.out.println("El área del círculo es: " + area);
    }
}
