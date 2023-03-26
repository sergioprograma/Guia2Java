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
public class Guia2_Ej3_MayusculasYminusculas {
    
    

    /**
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas
     y después toda en minúsculas.
      Nota: investigar la función toUpperCase() y toLowerCase() en Java.
    * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingresar una frase: ");
        
//        Scanner leer = new Scanner(System.in);
//        
//        String frase= leer.nextLine();
        
         String frase= "\nsergio esta estudiando Java";
         
         System.out.println(frase);
        
        System.out.println("\nLa frase en mayusculas es :");
        
        System.out.println(frase.toUpperCase());
        
        System.out.println("\nLa frase en minusculas es :");
        
        System.out.println(frase.toLowerCase()+"\n");
    }
    
}
