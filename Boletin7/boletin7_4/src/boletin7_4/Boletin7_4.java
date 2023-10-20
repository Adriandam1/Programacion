/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7_4;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletin7_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Pesos obx = new Pesos();
                System.out.print("Introduza o nome da primeira persoa: ");
                String nome1 = sc.nextLine();
                System.out.print("Introduza o peso de "+nome1+" : ");                
                int peso1 = sc.nextInt();
                
                // se pone este nextline porque los next dejan un \n al final y los nextline solo leen la siguiente linea
                    sc.nextLine();
                    
                System.out.print("Introduza o nome da segunda persoa: ");            
                String nome2 = sc.nextLine();
                System.out.print("Introduza o peso de "+nome2+" : ");
                int peso2 = sc.nextInt();
                obx.diferenciaPesos(nome1, peso1, nome2, peso2);

    }
    
}
