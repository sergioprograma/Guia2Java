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
public class Guia2_Ej4_GradosFahrenheit {

    /**
     * @param args the command line arguments
     */
//    Dada una cantidad de grados centígrados se debe mostrar su
//    equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
//    + (9 * C / 5).
    
    public static void main(String[] args) {
        
        System.out.println("Ingresar grados en centigrados\n");
        
        Scanner leer = new Scanner(System.in);
        
        float gradC= leer.nextFloat();
        
        float gradF= 32+(9*gradC/5);
        
        System.out.println("\n" + gradC+ " ° centigrados equivalen a " +gradF+" ° Fahrenheit\n");
        // TODO code application logic here
    }
    
}
