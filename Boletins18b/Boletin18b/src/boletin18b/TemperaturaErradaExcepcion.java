/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin18b;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class TemperaturaErradaExcepcion extends Exception {
    
    public TemperaturaErradaExcepcion(){
        
    }    
    public TemperaturaErradaExcepcion(String msg) {
    super(msg);
    }
        
    Scanner scanner = new Scanner(System.in);
    
    public void ErradaExcepcion() throws TemperaturaErradaExcepcion {
        float temperatura;    
        boolean entradaTemperatura = false;
    
        while (!entradaTemperatura){
            try{
                //Estas 2 lineas las quito que son la entrada
                System.out.print("Introduza a temperatura(>80): ");
                temperatura= Float.parseFloat(scanner.nextLine());
                
                if (temperatura <80){
                    throw new TemperaturaErradaExcepcion ("A temperatura nos pode ser menor a 80ºC.");
                    
                }
            System.out.println("Temperatura introducida correctamente: " + temperatura+" ºC");

            entradaTemperatura = true;
            } catch (NumberFormatException e) {
                
                System.out.println("No es un valor de temperatura válido. Por favor, intenta de nuevo.");

            } catch (TemperaturaErradaExcepcion e) {

                System.out.println(e.getMessage() + " Por favor, intenta de nuevo.");

            }
    
        }
    }
}
