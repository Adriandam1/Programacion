/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletins17;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Boletins17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        //Persoa obxP = new Persoa("nome","apelido", "123456789F");
        
        Conta obx = new Conta(4555555, 300, new Persoa("Fernando","Alonso", "12345D"));        
        System.out.println("Numero de conta: "+obx.getNumeroConta()+"\tSaldo: "+obx.getSaldo()+""+obx.getCliente()+"\n");        
        
        do{
            System.out.println("Indique a operacion:\n1- Realizar ingreso\n2- Retirada de fondos\n3- Actualizar saldo\n4- Datos conta\n0- Salir ");
            menu = sc.nextInt();
            
           switch ( menu){
            case 1 -> obx.ingresar();
            case 2 -> obx.retirar();
            case 3 -> obx.actualizarSaldo();
            case 4 -> System.out.println("Numero de conta: "+obx.getNumeroConta()+"\tsaldo: "+obx.getSaldo()+""+obx.getCliente()+"\n");
        }        
        }while (menu != 0);
                System.out.println("Fin do programa");
    }
}
    

