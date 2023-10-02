/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1, num2, suma, resta, producto, cociente;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir o primer numero: ");
        num1 = sc.nextFloat();
        System.out.print("Introducir o segundo numero: ");
        num2 = sc.nextFloat();
        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        cociente = num1 / num2;
        System.out.println(+num1+" + "+num2+ " = "+suma+"\n"+num1+" - "+num2+" = "+resta+"\n"+num1+" * "+num2+ " = "+producto+"\n"+num1+" / "+num2+ " = "+cociente);
    }
    
}
