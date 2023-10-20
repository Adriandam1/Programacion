/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin7_4;

/**
 *
 * @author Adrian
 */
public class Pesos {
    public void diferenciaPesos(String nome1,int peso1, String nome2, int peso2){
        int dif1 = peso1 - peso2;
        int dif2 = peso2 - peso1;
        if (peso1 > peso2)
            System.out.println(nome1+" pesa "+peso1+" kg e a diferencia e de "+dif1+"kg");
        else if (peso1 < peso2)
            System.out.println(nome2+" pesa "+peso2+" kg e a diferencia e de "+dif2+"kg");
        else
            System.out.println(nome1+" pesa igual que "+nome2);
    }
}
