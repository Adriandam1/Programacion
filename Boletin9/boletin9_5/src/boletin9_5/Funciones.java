/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin9_5;

/**
 *
 * @author Adrian
 */
import java.util.Scanner;

/**
 * Funciones utilizadas en la clase Main
 * @author adrian
 * @version v1.0
 *
 */


public class Funciones {

    /**
     * Comprueba si el sueldo esta entre 1000 y 1750
     * @param sueldo del trabajador
     * @return si esta dentro del rango
     */
    public static Boolean obtenerSueldo1750(Double sueldo) {
        if (sueldo > 1000 && sueldo < 1750){
            return true;
        }
        return false;
      //otra manera de ponerlo: return (sueldo > 1000 && sueldo < 1750);

    }

    /**
     * Comprueba si el sueldo es menor que mil
     * @param sueldo del trabajador
     * @return si es menos que 1000
     */
    public static Boolean obtenerSueldo1000(Double sueldo){
        if (sueldo > 0 && sueldo < 1000){
            return true;
        }
        return false;
    }

    /**
     * Alta trabajador
     * @return trabajador creado
     * v 2.0
     */
    public static Trabajador darAltaTrabajador(){
        Trabajador obxTrabajador= new Trabajador();
        //obxTrabajador.setNombre("Pepe");
        //obxTrabajador.setSueldo(1200d);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre: ");
        obxTrabajador.setNombre(sc.nextLine());
        System.out.println("Sueldo(escriba '0' para terminar el programa): ");
        obxTrabajador.setSueldo(sc.nextDouble());
        return obxTrabajador;
    }

}
