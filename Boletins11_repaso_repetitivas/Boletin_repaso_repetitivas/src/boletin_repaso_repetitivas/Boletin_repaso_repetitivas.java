/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin_repaso_repetitivas;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin_repaso_repetitivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        repaso obx = new repaso();
        System.out.println("ejercicio a ejecutar?(1-12): ");
        int ejer = sc.nextInt();
        switch (ejer){
            case 1 -> obx.ejercicio1();
            case 2 -> obx.ejercicio2();
            case 3 -> obx.ejercicio3();
            case 4 -> obx.ejercicio4();
            case 5 -> obx.ejercicio5();
            case 6 -> obx.ejercicio6();
            case 7 -> obx.ejercicio7();
            case 8 -> obx.ejercicio8();
            case 9 -> obx.ejercicio9();
            case 10 -> obx.ejercicio10();
            case 11 -> obx.ejercicio11();
            case 12 -> obx.ejercicio12();
        }
        if (ejer <=0 || ejer > 12)
            System.out.println("ERROR: Los ejercicios van de 1 a 12");
    }
    
}
