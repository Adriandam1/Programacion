/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float millas, resultado;
        final int METROS = 1852; // 1 milla = 1852 metros
        System.out.print("Numero de millas: ");
        Scanner input = new Scanner(System.in);
        millas = input.nextFloat();
        resultado = millas * METROS;
        System.out.println(+millas+" millas = "+resultado+" metros");
    }
    
}
