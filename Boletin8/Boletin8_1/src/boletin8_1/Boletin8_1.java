/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin8_1;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin8_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendasAnuais obx = new VendasAnuais();
        System.out.print("Escriba o nome do produto: ");
        String nome = sc.nextLine();
        System.out.print("Escriba o numero de vendas anuais: ");
        int vendas = sc.nextInt();
        obx.VendasAnuais(nome, vendas);
                
    }
    
}
