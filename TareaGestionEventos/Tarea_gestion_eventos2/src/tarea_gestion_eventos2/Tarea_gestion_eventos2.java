/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_gestion_eventos2;

import javax.swing.SwingUtilities;

/**
 *
 * @author Adrian
 */
public class Tarea_gestion_eventos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
         public void run() {
                new SelectorColores();
            }
        });
    }
    
}
