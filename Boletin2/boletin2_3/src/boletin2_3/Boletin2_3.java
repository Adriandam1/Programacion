/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin2_3;
import java.util.Scanner;
/**
 *
 * @author Adrian
 */
public class Boletin2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float euros, cambio, dolares;
        System.out.print("Euros a convertir: ");
        Scanner input = new Scanner(System.in);
        euros = input.nextFloat();
        System.out.print("El cambio esta actualmente a : ");
        cambio = input.nextFloat();
        dolares = euros * cambio;
        System.out.println(euros+" euros = "+dolares+" dolares");
    }
    
}
