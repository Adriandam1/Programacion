/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin9_3;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Rectangulo {
    float base;
    float altura;

    public Rectangulo() {
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    public void calcularArea(){
        Scanner sc = new Scanner(System.in);
        do{       
        System.out.println("Indique a base do rectangulo: ");
        base = sc.nextFloat();
        }while (base <= 0);
        do{
            System.out.println("Indique o altura do rectangulo: ");
            altura = sc.nextFloat();
        }while ( altura <=0);
        
        System.out.println("O area do triangulo e "+(base * altura));
            
    }
    
}
