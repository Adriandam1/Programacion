/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea_gestion_eventos2;

import java.util.Scanner;

/**
 *
 * @author Adrian
 *
 */


public class Tarea_gestion_eventos22 {

    /**
     * @param args the command line arguments
     */
    
    // Interfaz Validador
interface Validador {
    boolean validar(int numero);
}
    
    
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Implementar una clase anónima para validar números (par o impar)
        Validador validador = new Validador() {
            @Override
            public boolean validar(int numero) {
                // Validar si el número es par
                return numero % 2 == 0;
            }
        };

        // Solicitar al usuario que ingrese números hasta que introduzca el número 0
        int numero;
        do {
            try {
                System.out.print("Ingrese un número (0 para salir): ");
                numero = scanner.nextInt();

                // Validar si el número es par o impar y mostrar un mensaje en consola
                if (numero != 0) {
                    if (validador.validar(numero)) {
                        System.out.println("El número es par.");
                    } else {
                        System.out.println("El número es impar.");
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next(); // Limpiar el buffer del scanner
                numero = -1; // Asignar un valor inválido para repetir el bucle
            }
        } while (numero != 0);

        // Cerrar el scanner al finalizar
        scanner.close();
    }
}
