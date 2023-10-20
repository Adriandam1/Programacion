/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7_3;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin7_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numero obx = new Numero();
        System.out.print("Introduza o numero: ");
        int numero = sc.nextInt();
        obx.verPositivo(numero);
    }
    
}
