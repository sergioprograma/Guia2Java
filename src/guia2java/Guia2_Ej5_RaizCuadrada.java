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
public class Guia2_Ej5_RaizCuadrada {

    /**
     * @param args the command line arguments
     */
    
//    Escribir un programa que lea un número entero por teclado y muestre
//por pantalla el doble, el triple y la raíz cuadrada de ese número.
//Nota: investigar la función Math.sqrt().
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingresar un numero entero:  ");
        
        int num= leer.nextInt();
        
        System.out.println("\nEl doble de "+num+" es: "+(num*2));
        
        System.out.println("\nEl triple de "+num+" es: "+(num*3));
        
        System.out.println("\nLa raiz cuadrada de "+num+" es: "+ (Math.sqrt(num))+"\n");
    }
    
}
