/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_2;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float temperatura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique a temperatura en grados Centigrados");
        temperatura = sc.nextFloat();
        float fahrenheit = (temperatura * 9 / 5) +32;
        float kelvin = temperatura +273;
        
        System.out.println(+temperatura+ "ºC= "+fahrenheit+" ºF");
        System.out.println(+temperatura+ "ºC= "+kelvin+" ºK");
    }
    
}
