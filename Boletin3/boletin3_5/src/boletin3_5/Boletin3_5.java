/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin3_5;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
public class Boletin3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        System.out.print("Soldo fixo: ");
        float soldo=entrada.nextFloat();

        System.out.print("Total de vendas: ");
        float ventas= entrada.nextFloat();

        System.out.print("Quilometraxe realizado: ");
        float km = entrada.nextFloat();

        System.out.print("Dias de desprazamento: ");
        int dias= entrada.nextInt();
        
        // percibimos un 5% de comision das ventas
        ventas = (float) (ventas * 0.05);
                
         // percibimos 2 euros por kilometro
        km = km * 2;
        
        //percibimos 30 euros por dia de desprazamento
        dias = 30 * dias;
        
        //calculo do soldo bruto
        float soldobruto = soldo + ventas + km + dias;
        
        //calculo soldo neto co 18% de retencion e -36euros da seguridad social
        float soldoneto = (float) (soldobruto * 0.82 - 36);
        
        System.out.println("Soldo bruto: "+ soldobruto+" €.");
        System.out.println("Soldo neto: "+soldoneto+" €.");

    }
    
}
