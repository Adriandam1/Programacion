/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin6_2;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Satelite satelite1 = new Satelite();
        /*
        double m, p, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Meridiano: ");
        m = sc.nextDouble();
        System.out.println("Paralelo: ");
        p = sc.nextDouble();
        System.out.println("Distancia a la tierra: ");
        d = sc.nextDouble();
        */
        
        satelite1.verPosicion(5, 4, 1000);
    }
    
}
