/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplocondicionais;

/**
 *
 * @author Adrian
 */
public class CondicionalSimple {
    

    public void verMaior(int num1, int num2){
        // si se tiene solo una sentencia no es obligatorio poner llaves {}
        if (num1 > num2){
            System.out.println(num1+" e maior que "+num2);
        }
        System.out.println("saimos do condicional");
    }
    
    public void maiorIdade(int idade){
        if (idade >= 18){
            System.out.println("a persoa e maior de idade");
        }
    }
    
}
