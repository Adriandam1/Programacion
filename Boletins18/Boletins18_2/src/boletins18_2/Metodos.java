/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins18_2;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Metodos {
    int zona;
    float custo;
    
    Scanner sc = new Scanner(System.in);

    public Metodos() {
    }

    public Metodos(int zona, float custo) {
        this.zona = zona;
        this.custo = custo;
    }
    
    public void getprezo(){
        float peso;
        // En este do saco el menu para elegir el destino
        do{
            System.out.println("Indique o destino:\n1- America do Norte\n2- America Central\n3- America do Sur\n4- Europa\n5- Asia ");
            zona = sc.nextInt();
            
           switch ( zona){
            case 1:
                custo = 24;
                break;
            case 2:
                custo = 20;
                break;
            case 3:
                custo = 21;
                break;
            case 4:
                custo = 10;
                break;
            case 5:
                custo = 18;
                break;
            default:
                System.out.println("Error seleccione destino 1-5");
        }        
        }while (zona < 1 || zona >5);
        // En este do indico el peso del paquete
        do{
            System.out.println("Indique o peso do paquete en KG: ");
            peso = sc.nextFloat();
            if (peso >5)
                System.out.println("ERROR o peso maximo do paquete e de 5 KG ");
            if (peso<=0)
                System.out.println("O paquete debe tener peso");
            
        }while (peso >5 || peso <=0);
        // outprint con el precio del paquete
        System.out.println("O prezo do envio e: "+(custo * peso)+" €");
        
        
    }
    
}
