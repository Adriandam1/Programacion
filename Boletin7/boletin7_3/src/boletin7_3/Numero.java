/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin7_3;

/**
 *
 * @author Adrian
 */
public class Numero {
    public void verPositivo(int numero){
        if (numero >0)
            System.out.println(numero+" e positivo");
        else if (numero < 0)
            System.out.println(numero+" e negativo");
            else
                System.out.println(numero+" e cero");        
    }
}
