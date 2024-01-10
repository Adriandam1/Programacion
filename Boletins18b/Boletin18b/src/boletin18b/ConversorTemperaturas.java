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
public class ConversorTemperaturas {
    static final float centrigrados = 80;
    Scanner scanner = new Scanner(System.in);
    
    public float centigradosAFharenheit(float centrigrados){
        float temperatura;
        float Fharenheit=0;
       
    // Fharenheir = 9,0 / 5, 0 * centígrados + 32, 4
    // Este método non tratará a excepción ( TemperaturaErradaExcepcion ), e, se a temperatura é < 80 º centígrados  lanzará a excepción que será capturada e tratada na clase principal . 
        System.out.print("Introduza a temperatura(>80): ");
        temperatura= Float.parseFloat(scanner.nextLine());
        //TemperaturaErradaExcepcion.ErradaExcepcion();
    
    return Fharenheit;
    }
    public void centígradosAReamur(){
    // Reamur = 4,0 / 5,0 * centígrados 
    // Este método non tratara a excepción . A lanzará ao método de chamada
    }
            
}
