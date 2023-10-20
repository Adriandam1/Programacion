/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin7_5;

/**
 *
 * @author Adrian
 */
public class TresNumeros {
    public void comparoNumeros(float num1, float num2, float num3){
        if (num1 > num2) 
            if (num1 > num3) 
                System.out.println("O maior numero e: "+num1); 
            else 
                System.out.println("O maior numero e: "+num3);          
        else if (num2 > num3)
            System.out.println("O maior numero e: "+num2); 
        else
            System.out.println("O maior numero e: "+num3);
    }    
}
