/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7_1;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin7_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Positivo obx = new Positivo();
        System.out.print("Introduza o numero: ");
        int numero = sc.nextInt();
        obx.ePositivo(numero);
    }
    
}
