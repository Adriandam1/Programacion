/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7_5;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin7_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TresNumeros obx = new TresNumeros();
        System.out.print("Escriba o primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Escriba o segundo: ");
        int num2 = sc.nextInt();
        System.out.print("Escriba o tercer numero: ");
        int num3 = sc.nextInt();
        obx.comparoNumeros(num1, num2, num3);
    }
    
}
