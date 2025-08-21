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
public class Java8 {
 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, altura, perimetro, area;

        System.out.print("Ingrese la base del rectángulo: ");
        base = input.nextDouble();

        System.out.print("Ingrese la altura del rectángulo: ");
        altura = input.nextDouble();

        perimetro = 2 * (base + altura);
        area = base * altura;

        System.out.println("El perímetro del rectángulo es: " + perimetro);
        System.out.println("El área del rectángulo es: " + area);
    }
    
}
