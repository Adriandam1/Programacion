/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_1;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float tarifa;
        float pagado;
        float descuento;
        float porcentaxe;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Indique o prezo da tarifa: ");
        tarifa = sc.nextFloat();
        System.out.println("Indique o prezo pagado: ");
        pagado = sc.nextFloat();
        descuento = tarifa - pagado;
        porcentaxe = 100 / (tarifa / descuento);
        
        System.out.println("porcentaxe = "+porcentaxe+ "%");
    }
    
}
