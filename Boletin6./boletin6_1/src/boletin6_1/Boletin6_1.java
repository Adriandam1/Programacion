/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin6_1;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Coche coche1 = new Coche();
        
        //asignar valor a velocidade(velocidad actual en coche.java(0))
        coche1.getVelocidade();
        System.out.println("velocidade actual: "+coche1.getVelocidade()+" km/h");
        
        //incrementar el contador, hacemos variable acelero, llamamos a acelerar y le damos a valor "valor" el valor "acelero" que introducimos con sc
        int acelero;
        System.out.print("aceleramos(km/h): ");
        acelero = sc.nextInt();
        coche1.acelerar(acelero);
        System.out.println("velocidad final tras acelerar: "+coche1.getVelocidade()+" km/h");
        
        //reducir el contador, hacemos variable freno, llamamos a frenar y le damos al valor "menos" el valor "freno" que introducimos con sc
        int freno;
        System.out.print("frenamos(km/h): ");
        freno = sc.nextInt();
        coche1.frenar(freno);
        System.out.println("velocidad final tras frenar: "+coche1.getVelocidade()+" km/h");
        
        
        
    }
    
}
