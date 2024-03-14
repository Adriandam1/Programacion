/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletins18entero;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletins18entero {

public static void main(String[] args) {
        // Creación de un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Creación de un objeto de la clase ConversorTemperaturas
        ConversorTemperaturas conversor = new ConversorTemperaturas();

        // Solicitar al usuario que introduzca la temperatura en grados centígrados
        System.out.print("Introduce la temperatura en grados centígrados: ");
        // Leer la temperatura proporcionada por el usuario
        float temperatura = scanner.nextFloat();

        // Intentar convertir la temperatura a Fahrenheit y manejar la excepción
        try {
            float fahrenheit = conversor.centigradosAFahrenheit(temperatura);
            // Imprimir la temperatura convertida a Fahrenheit
            System.out.println("Temperatura en Fahrenheit: " + fahrenheit);
        } catch (TemperaturaErradaExcepcion e) {
            // Imprimir el mensaje de error si la temperatura es demasiado baja
            System.out.println(e.getMessage());
        }

        // Intentar convertir la temperatura a Reamur y manejar la excepción
        try {
            float reamur = conversor.centigradosAReamur(temperatura);
            // Imprimir la temperatura convertida a Reamur
            System.out.println("Temperatura en Reamur: " + reamur);
        } catch (TemperaturaErradaExcepcion e) {
            // Imprimir el mensaje de error si la temperatura es demasiado baja
            System.out.println(e.getMessage());
        }

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}