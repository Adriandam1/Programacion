/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin8_2;

import java.util.Scanner;


/**
 *
 * @author Adrian
 */
public class Figuras {
    public void calculoCadrado(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza o lado do cadrado: ");
        float lado = sc.nextFloat();
        float area = lado * lado;
        System.out.println("O area do cadrado e: "+area);    
    }
    public void calculoTriangulo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza o base do triangulo: ");
        float base = sc.nextFloat();
        System.out.print("Introduza a altura do triangulo: ");
        float altura = sc.nextFloat();
        float area = (base * altura)/2;
        System.out.println("O area do triangulo e: "+area);    
    }
    public void calculoCirculo(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduza o radio do circulo : ");
        float radio = sc.nextFloat();
        float pi = (float) 3.14;
        float area = (pi* (radio * radio));
        System.out.println("O area do circulo e: "+area);    
    }
  /*  public float pedirFloat(String mensaxe){
        Scanner sc = new Scanner(System.in);
        float dato= sc.nextFloat();
                return dato;
        
    }*/ 
}
