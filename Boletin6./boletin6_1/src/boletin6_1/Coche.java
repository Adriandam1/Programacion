/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin6_1;

/**
 *
 * @author Adrian
 */
public class Coche {
     private int velocidade ;

    public Coche(){
    velocidade =0 ;
    }
    
    // Este método devolve a velocidade actual
    public int getVelocidade(){
        return velocidade;
    }
    
    // Este método incrementa a velocidade na cantidade valor
    public void acelerar (int valor){ 
        velocidade = velocidade + valor;
    }
    
    // Este método diminue a velocidade na cantidade menos.
    public void frenar (int menos){
        velocidade = velocidade - menos;
        
    }
}