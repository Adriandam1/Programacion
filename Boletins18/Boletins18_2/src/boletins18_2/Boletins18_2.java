/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletins18_2;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletins18_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String repetir;
        Metodos obx = new Metodos();
        
        do{
        obx.getprezo();
        
        System.out.println("Se desexa enviar mais paquetes escriba 'si'");
        repetir = sc.nextLine();
        }while ("si".equalsIgnoreCase(repetir));
        
    }
    
}
