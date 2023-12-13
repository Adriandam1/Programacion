/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin6_3;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Circulo {
    double radio;
    final static double pi=3.14;
    
    Scanner sc = new Scanner(System.in);

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void calcularArea(){
        System.out.println("Indique o radio da circunferencia: ");
        radio = sc.nextDouble();
        double area = pi * Math.pow(radio, 2);
        System.out.println("O area da circunferencia e: "+area);
        
    }
    public void calcularLonxitude(){
        System.out.println("A lonxitude da circunferencia e: "+(2*pi*radio));
        
    }
    
}
