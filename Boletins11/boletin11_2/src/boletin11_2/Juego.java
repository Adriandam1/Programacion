/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrian
 */
public class Juego {
     int numero,intentos, diferencia;
     String distancia;
     int fallos =0;
    

    public void pedirNumero(){
        
       numero = (int) (Math.random() * (50 - 1)) + 1;

    }
    public void numeroIntentos(){
        intentos = Integer.parseInt(JOptionPane.showInputDialog("Cantos intentos?: "));
        if (intentos <=0){
            JOptionPane.showMessageDialog(null, "O numero de intentos non pode ser negativo ou 0...");
            numeroIntentos();}
        intentos--;
    }
    public void adivinaNumero(){
        int adivino = Integer.parseInt(JOptionPane.showInputDialog("Adivina o numero(1-50) teñes "+(intentos - fallos+1) +" intentos restantes e estas "+distancia+ ": "));
        if (adivino == numero){
            JOptionPane.showMessageDialog(null, "Correcto! HAS GANADO!");
            fallos = 0;
            pedirNumero();numeroIntentos();adivinaNumero();}
        else{
            fallos++;
            if (numero > adivino){
                diferencia = numero - adivino;
            }else if (numero < adivino)
                diferencia = adivino - numero;
            
            if (diferencia > 20)
                distancia = "moi lonxe";
            if (diferencia >= 10 && diferencia <=20)
                distancia ="lonxe";
            if (diferencia >5 && diferencia <10)
                distancia ="preto";
            if (diferencia <= 5)
                distancia ="moi preto";           
            
            
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
