/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletins18_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrian
 */
public class Boletins18_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int chamar;
        Chamada obx = new Chamada();
        do{
        obx.calcularImposto();
        obx.calcularCusto();
        chamar = Integer.parseInt(JOptionPane.showInputDialog("Para volver achamar prema 1, en caso contrario calquer outra tecla"));
        }while (chamar==1);
        
    }
    
}
