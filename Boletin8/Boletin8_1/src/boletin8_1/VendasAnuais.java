/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin8_1;

/**
 *
 * @author Adrian
 */
public class VendasAnuais {
    public void VendasAnuais(String nome, int vendas){
        if (vendas <=100)
            System.out.println("O produto "+nome+" e tipo baixo");
        else if (vendas >100 && vendas <=500)
            System.out.println("O produto "+nome+" e tipo medio");
        else if (vendas  > 500 && vendas <=1000)
            System.out.println("O produto "+nome+" e tipo alto");
        else if (vendas > 1000)
            System.out.println("O produto "+nome+" e de primeira necesidade");
        else 
            System.out.println("Error");
        }
        
    }
