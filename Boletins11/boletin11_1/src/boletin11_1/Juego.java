/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrian
 */
public class Juego {
    int numero, intentos;
    int fallos =0;
    

    public void pedirNumero(){
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduza o numero secreto(1-50): "));
        if (numero <=0 || numero >50){
            JOptionPane.showMessageDialog(null, "O numero introducido "+numero+" non e valido");
            pedirNumero();}
    }
    public void numeroIntentos(){
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Cantos intentos?: "));
        if (intentos <=0){
            JOptionPane.showMessageDialog(null, "O numero de intentos non pode ser negativo ou 0...");
            numeroIntentos();}
        intentos--;
    }
    public void adivinaNumero(){
        int adivino = Integer.parseInt(JOptionPane.showInputDialog("Adivina o numero(1-50) teñes "+(intentos - fallos+1) +" intentos restantes: "));
        if (adivino == numero){
            JOptionPane.showMessageDialog(null, "Correcto! HAS GANADO!");
            fallos = 0;
            pedirNumero();numeroIntentos();adivinaNumero();}
        else{
            fallos++;
            //esto da mensaje de error para confirmar el if-> JOptionPane.showMessageDialog(null, "Incorrecto teñes "+(intentos - fallos+1) +" intentos restantes");
            if (fallos > intentos){
                JOptionPane.showMessageDialog(null, "Has perdido!");
                fallos = 0;
                pedirNumero();numeroIntentos();adivinaNumero();}
            else
                adivinaNumero();
        }
            
    }
    
}
