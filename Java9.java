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
public class Java9 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radio, altura, area, volumen;

        System.out.print("Ingrese el radio del cilindro: ");
        radio = input.nextDouble();

        System.out.print("Ingrese la altura del cilindro: ");
        altura = input.nextDouble();

        // Usamos Math.PI para mayor precisión
        area = 2 * Math.PI * radio * radio + 2 * Math.PI * radio * altura; 
        volumen = Math.PI * radio * radio * altura;

        System.out.println("El área del cilindro es: " + area);
        System.out.println("El volumen del cilindro es: " + volumen);
    
    }

}
