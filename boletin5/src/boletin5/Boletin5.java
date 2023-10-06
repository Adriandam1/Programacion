/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5;

/**
 *
 * @author Adrian
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // a) Crea un obxecto, de tipo consume, utilizando o constructor sen parámetros
        consumo obxConsume = new consumo();
        // b) Dalle a litros o valor 50 e a prezo da gasolina 1.57
        float eur = obxConsume.consumoEuros(50, 1.57f);
        //(el ejercicio non dice que o amose) System.out.println("euros = "+eur);
        
        // c) Crea un obxecto, tipo consumo, utilizando o contructor con todos os parámetros
        consumo obxConsumo = new consumo();
        
        //llamada a consumo medio para el consumo gasolina y lo visualizo
        float gas = obxConsumo.consumoMedio(200, 100);
        System.out.println("El consumo de gasolina es "+gas+" litros/km");
        
        // e) Varia o valor dos litros consumidos do 2º obxecto.
        
        // f) Visualiza a velocidade media do 2º obxecto.
        
    }
    
}
