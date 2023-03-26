/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2Java;

import java.util.Scanner;

/**
 *
 * @author usand
 */
public class Guia2_Ej1_Suma {

    /*Escribir un programa que pida dos números enteros por teclado y calcule
      la suma de los dos. El programa deberá después mostrar el resultado de 
       la suma
    
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Para calcular la suma ingresar el primer numero");

        double num1 = leer.nextDouble();

        System.out.println("Ingresar el segundo numero");

        double num2 = leer.nextDouble();

        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + (num1 + num2));
        // TODO code application logic here
    }

}
