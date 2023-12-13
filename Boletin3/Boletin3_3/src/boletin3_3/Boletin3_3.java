/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_3;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin3_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b100, b20, b5, m1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantos billetes de 100€?");
        b100 = sc.nextInt();
        System.out.println("Cantos billetes de 20€?");
        b20 = sc.nextInt();
        System.out.println("Cantos billetes de 5€?");
        b5 = sc.nextInt();
        System.out.println("Cantas monedas de 1€?");
        m1 = sc.nextInt();
        int total = b100 * 100 + b20 * 20 + b5 * 5 + m1;
        
        System.out.println("A cantidade total e de "+total+" €");
    }
    
}
