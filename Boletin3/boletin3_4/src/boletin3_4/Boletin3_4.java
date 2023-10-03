/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_4;

import java.util.Scanner;

public class Boletin3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int euros ,cien, veinte ,cinco ,uno;
        System.out.print("Introducir cantidad enteira de euros: ");
        euros = sc.nextInt();
        cien = euros / 100;
        veinte = euros%100/20;
        cinco = ((euros%100)%20)/5;
        uno = ((euros%100)%20)%5;
        System.out.println(cien+" billetes de 100€");
        System.out.println(veinte+ " billetes de 20€");
        System.out.println(cinco +" billetes de 5€");
        System.out.println(uno+" monedas de 1€"); 
        
    }    
}
