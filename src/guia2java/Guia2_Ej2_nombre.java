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
public class Guia2_Ej2_nombre {

    /**
     * Escribir un programa que pida tu nombre, lo guarde en una variable y lo
         muestre por pantalla.
         * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese un nombre");
        
        Scanner leer = new Scanner(System.in);
        
        String nombre= leer.nextLine();
        
        System.out.println("El nombre ingresado es: " + nombre);
        // TODO code application logic here
    }
    
}
