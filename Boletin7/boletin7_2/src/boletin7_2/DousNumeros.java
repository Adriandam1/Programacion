/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin7_2;

/**
 *
 * @author Adrian
 */
public class DousNumeros {
    public void comparoNumeros(short num1, short num2){
        int resta = num1 - num2;
        int suma = num1 + num2;        
        if (num1 > num2){
            System.out.println("A resta de "+num1+" - "+num2+" = "+resta);}
        System.out.println("A suma dos numeros "+num1+" + "+num2+" = "+suma);
    }
    
}
