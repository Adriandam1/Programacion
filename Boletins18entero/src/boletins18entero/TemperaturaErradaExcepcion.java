/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins18entero;

// Clase de excepción personalizada para manejar temperaturas erróneas
public class TemperaturaErradaExcepcion extends Exception {
    // Constructor de la clase de excepción
    public TemperaturaErradaExcepcion(String mensaje) {
        super(mensaje); // Llama al constructor de la clase base (Exception)
    }
}
