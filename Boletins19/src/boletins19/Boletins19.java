/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletins19;

/**
 *
 * @author Usuario
 */
public class Boletins19 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        // Creamos un objeto de la clase Persoa.
        Persoa persoa = new Persoa();
        // Hacemos que la persona cante.
        persoa.cantar();

        // Creamos un objeto de la clase Canario.
        Canario canario = new Canario();
        // Hacemos que el canario cante.
        canario.cantar();

        // Creamos un objeto de la clase Galo.
        Galo galo = new Galo();
        // Hacemos que el gallo cante.
        galo.cantar();
    }
}