/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletins14;

import partes.Monitor;
import partes.Procesador;
import partes.Teclado;

/**
 *
 * @author Adrian
 */
public class Boletins14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Monitor obxmo = new Monitor(20);
        Teclado obxte = new Teclado("Logitech");
        Procesador obxpro = new Procesador(4.2f);
        Ordenador obx = new Ordenador(obxmo, obxte,obxpro, 800);   
        
        System.out.println(obx.toString());
        
    }
    
}
