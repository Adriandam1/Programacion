/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin4;

/**
 *
 * @author Usuario
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro obx = new Libro("La comunidad del anillo","Tolkien", 1950, (short) 800, 9.9f);
        System.out.println(obx);
        obx.amosar("El retorno del rey","Tolkien", 1951, (short) 600, 9.9f);
        System.out.println(obx.toString());
    }
    
}
