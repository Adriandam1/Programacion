/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin9_2;


/**
 *
 * @author Adrian
 */
public class SumaProducto {
    public void sumaProducto(int num1, int num2){
        int suma = 10;
        int producto = 10;
        int i = num1;
        System.out.println("A continuacion: suma e o producto dos números comprendidos entre "+num1+" e "+num2+"\n");
        while (i<num2){
            int totalsuma = num1 + (++suma);
            System.out.println("La suma de 10 + "+(i+1)+" = "+totalsuma); 
            int totalproducto = num1 * (++producto);
            System.out.println("O producto de 10 * "+(i+1)+" = "+totalproducto+"\n"); 
            i++;
        }
        System.out.println("Fin do programa"); 
    }
    
}
