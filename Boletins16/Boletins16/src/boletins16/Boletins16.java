/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletins16;

/**
 *
 * @author Adrian
 */
public class Boletins16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Publicacion obxL = new Libro(true, 5, "El señor de los anillos", 1960);
        Publicacion obxR = new Revista(2,4,"PeloPicoPata",2012);
        
        System.out.println("Libro:\n"+obxL);
        System.out.println("\nRevista:\n"+obxR);
        
    }
    
}
