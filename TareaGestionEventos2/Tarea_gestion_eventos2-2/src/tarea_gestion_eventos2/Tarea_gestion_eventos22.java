/*
Enunciado 2: Validador de Números
Objetivo: Crear una aplicación simple de consola que solicite al usuario
ingresar números hasta que introduzca un número específico (por ejemplo, el
número 0). Utilizar una interfaz con un método que valide si el número
ingresado cumple con una condición particular (por ejemplo, si es par o
impar) y mostrar un mensaje en consola. Implementar la lógica de validación
dentro de una clase anónima.
Requisitos:
Definir una interfaz Validador con un método que acepte un número y
devuelva boolean.
Solicitar al usuario que ingrese números a través de la consola.
Utilizar Scanner para leer la entrada del usuario.
Implementar una clase anónima que realice la validación de números (par o
impar) utilizando la interfaz Validador.
Incorporar un bucle para repetir la solicitud de números hasta que el usuario
introduzca el número 0.
Manejar adecuadamente las excepciones que puedan ocurrir al leer la
entrada del usuario.
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
