/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin8_2;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figuras obx = new Figuras();
        
        System.out.print("Seleccione unha figura \n cadrado\n triangulo\n circulo\n -------> ");
        String figura = sc.nextLine();
        
        switch (figura){
            case "cadrado":
                obx.calculoCadrado();                
                break;
            case "triangulo":
                obx.calculoTriangulo();
                break;
            case "circulo":
                obx.calculoCirculo();
                break;
            default:
                System.out.println("Error selecciona unha das option indicadas");
        }       
    }
    
}
