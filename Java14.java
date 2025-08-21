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
public class Java14 {
     private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double r, theta, radianes, x, y, valorPi;

        valorPi = 3.1416;
        r = input.nextDouble();
        theta = input.nextDouble();

        radianes = theta * (valorPi / 180.0);
        x = r * Math.cos(radianes);
        y = r * Math.sin(radianes);

        System.out.println("La coordenada X es: " + x);
        System.out.println("La coordenada Y es: " + y);
    }
 

}
