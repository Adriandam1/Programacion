/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin9_4;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número entero: ");                                                         
        numero = sc.nextInt();
        for(int i = 1; i<=10; i++){
             System.out.println(numero+ " * " + i + " = " +numero * i);    
             
        }
    }
    
}
