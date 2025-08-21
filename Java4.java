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
public class Java4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lado, apotema, perimetro, area;

        System.out.print("Ingrese la medida del lado del pentágono: ");
        lado = input.nextDouble();

        System.out.print("Ingrese la medida del apotema: ");
        apotema = input.nextDouble();

        perimetro = 5 * lado;
        area = (perimetro * apotema) / 2;

        System.out.println("El perímetro del pentágono es: " + perimetro);
        System.out.println("El área del pentágono es: " + area);
    }
}
