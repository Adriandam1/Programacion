/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin_repaso_repetitivas;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class repaso {
    Scanner sc = new Scanner(System.in);
    public void ejercicio1 (){
                for (int i = 0; i < 5; i++){
            System.out.println("Isto e un bucle");}  
    }
    
    public void ejercicio2(){
        int i=0;
        int numero;
        while (i<5){
            System.out.println("Escriba un numero: ");
            numero = sc.nextInt();
            i++;
            System.out.println(+numero);
        }        
    }
    public void ejercicio3(){
        int numero;
        do{
            System.out.println("Escriba un numero(0 para salir): ");
            numero = sc.nextInt();
            System.out.println(+numero);
        }while (numero != 0);
                System.out.println("fin do programa");
        
    }
    public void ejercicio4(){
        int i=0;
        int numero;
        while (i<4){
          do{ 
            System.out.println("Escriba un numero: ");
            numero = sc.nextInt();            
          }while (numero <0);           
           System.out.println(numero);
           i++;
        }
        System.out.println("Saimos do bucle");
    }
    public void ejercicio5(){        
        int i=0;
        int numero;
        int suma=0;
        while (i<4){
          do{ 
            System.out.println("Escriba un numero: ");
            numero = sc.nextInt();            
          }while (numero <0);           
           System.out.println(numero);
           i++;
           suma = suma + numero;
        }
        System.out.println("A suma dos numeros e: "+suma);
    }
    public void ejercicio6(){
        int lado;
        System.out.println("Escriba o lado do cadrado: ");
        lado = sc.nextInt();
        System.out.println("O area do cadrado e: "+lado * lado);
        
    }
    public void ejercicio7(){
        int lado;
        System.out.println("Escriba o lado do cadrado: ");
        lado = sc.nextInt();
        if (lado >= 0)
        System.out.println("O area do cadrado e: "+lado * lado);
        else 
        System.out.println("ERROR o lado non pode negativo");
    }
    public void ejercicio8(){
        int lado;
        do{
            System.out.println("Escriba o lado do cadrado(0 para salir): ");
            lado = sc.nextInt();
            System.out.println("O area do cadrado e: "+lado * lado);
        }while (lado != 0);
                System.out.println("fin do programa");        
    }
    public void ejercicio9(){
        // ejercicio 5 sin bucle y condicion de salida >100
        int numero;
        int suma=0;
          do{ 
            System.out.println("Escriba un numero: ");
            numero = sc.nextInt(); 
            suma = suma + numero;
          }while (suma <100);           
           System.out.println(numero);        
        System.out.println("A suma dos numeros e: "+suma);
    }
    public void ejercicio10(){
        int i = 0;
        float nota;
        float media = 0;
        do{
            i++;
            System.out.println("Introduza nota do modulo"+i+" : ");
            nota = sc.nextInt();
            media = media + nota;
           }while (i<6);
        media = media/6;
        System.out.println("A media dos 6 modulos e: "+media);
    }
    public void ejercicio11(){
        int ialu = 0;
        int i = 0;
        float nota;
        float media = 0;
        do{
        do{
            i++;
            System.out.println("Introduza nota do modulo"+i+" : ");
            nota = sc.nextInt();
            media = media + nota;
           }while (i<6);
        ialu++;
        media = media/6;
        System.out.println("A media dos 6 modulos e: "+media+" do alumno "+ialu);
        i = 0;
        nota = 0;
        media = 0;
        
        }while (ialu<4);
    }    
    /*
    * El ejercicio12 deberia hacerse usando multiples metodos, solo uso un metodo por que asi ize el resto del boletin...
    */
    public void ejercicio12(){
        int ialu = 0;
        int i = 0;
        float nota;
        float media = 0;
        String continuar;
        do{
        do{
            i++;
            System.out.println("Introduza nota do modulo"+i+" : ");
            nota = sc.nextInt();
            media = media + nota;
           }while (i<6);
        ialu++;
        media = media/6;
        System.out.println("A media dos 6 modulos e: "+media+" do alumno "+ialu);
        i = 0;
        nota = 0;
        media = 0;
        System.out.println("Queres introducir outro alumno(S/N): ");
        sc.nextLine();
        continuar = sc.nextLine();
        }while ("S".equals(continuar));
        if ("N".equals(continuar))
            System.out.println("Fin do programa");
        else
            System.out.println("Respuesta no valida fin do programa");
    }
}
