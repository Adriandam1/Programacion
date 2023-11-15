/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins12;

import static boletins12.Garaxe.numeroCoches;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Funcions {
    static String cocheNovo;
    
        public static void menu(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Prazas dispoñibles: "+(5 - numeroCoches+"\n"));
            System.out.println("Que queres facer:\n\tEngadir coche: 1\n\tRetirar coche: 2\n\tSalir: 3\n");
            int menu = sc.nextInt();
            switch (menu){
                case 1 -> Funcions.engadirCoche();
                case 2 -> Funcions.retirarCoche();
                case 3 -> System.out.println("Fin do programa");
            }
        }
    
    
        public static void verEstadoGaraxe(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Coches no garaxe: ");
         Garaxe.setNumeroCoches(sc.nextInt());
         if (numeroCoches >=5)
             System.out.println("Garaxe COMPLETO");
         else if (numeroCoches < 0){
             System.out.println("O garaxe nos pode estar en negativo");
             verEstadoGaraxe();
        }
        }
        public void verPlazasLibres(){
            int plazas = 5 - numeroCoches;
            System.out.println("Prazas dispoñibles: "+plazas+"\n");
        }
        public static void engadirCoche(){
            Scanner sc = new Scanner(System.in);
            if (numeroCoches >=5){
                System.out.println("ERROR: Garaxe completo");
                menu();
                }
            else{
            Coche obx = new Coche();
            System.out.println("Matricula do coche: ");
            obx.setMatricula(sc.nextLine());
            System.out.println("Marca do coche: ");
            obx.setMarca(sc.nextLine());
            
            String cocheNovo = obx.toString();
            System.out.println(cocheNovo);
            //System.out.println(obx.toString());
            
            menu();
            }   
        }
        public static void retirarCoche(){
            Scanner sc = new Scanner(System.in);
            
            //necesito crear objeto para llamar al toString pero como eso me incrementa numeroCoches tengo que corregirlo
           //Coche obx = new Coche(); Garaxe.setNumeroCoches(--numeroCoches);
            
            if (numeroCoches>0){
                Garaxe.setNumeroCoches(--numeroCoches);
                System.out.println("preguntaremos cuanto a estado en horas");
                int horas= sc.nextInt();
                if (horas<=3){
                    System.out.println("Factura: 1,5€\n"+cocheNovo);
                    
                    menu();
                }
                if (horas>3){
                    System.out.println("Factura: "+((horas-3)*0.2+1.5)+" €");
                    menu();
                }
                else{
                    System.out.println("Nos has podido estar tempo negativo...");
                    retirarCoche();
                }
            }
            else if (numeroCoches <=0){
                System.out.println("Non podes retirar coches cuando non hai ningun, xefe!\n");
                menu();
                }
            
        }
}
