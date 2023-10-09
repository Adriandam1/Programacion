/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemjoptionpane;

import javax.swing.JOptionPane; //importamos libreria jpane

/**
 *
 * @author Adrian
 */
public class ExemJOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pedir datos        
        float dato = Float.parseFloat( JOptionPane.showInputDialog("teclea numero"));
        //System.out.println(dato);
        
        //amosamos con JOptionPane, el "null" es la ventana por defecto        
        JOptionPane.showMessageDialog(null, "o valor e : "+dato);
    }
    
}
