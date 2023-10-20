/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7_2;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin7_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DousNumeros obx = new DousNumeros();
        System.out.print("introduza o primer numero: ");
        short num1 = sc.nextShort();
        System.out.print("introduza o segundo numero: ");
        short num2 = sc.nextShort();
        obx.comparoNumeros(num1, num2);

    }
    
}
