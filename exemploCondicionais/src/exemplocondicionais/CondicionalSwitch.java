/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplocondicionais;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrian
 */
public class CondicionalSwitch {
    public void verDiaSemana(){
        
        int dia = Integer.parseInt (JOptionPane.showInputDialog("Teclea numero dia: "));
        switch (dia){
            case 1: System.out.println("Luns");
                break;
            case 2: System.out.println("Martes");
                break;
            case 3: System.out.println("Mercores");
                break;
            case 4: System.out.println("Xoves");
                break;
            case 5: System.out.println("Venres");
                break;
            case 6: System.out.println("Sabado");
                break;
            case 7: System.out.println("Domingo");
                break;
                
                // default nos sirve para cuando en el switch no se han cumplido ninguna de los case
            default: System.out.println("Error!");
                        
        }               
    }
}
