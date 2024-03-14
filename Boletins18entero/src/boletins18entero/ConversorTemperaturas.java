/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins18entero;

// Clase para realizar conversiones de temperatura
public class ConversorTemperaturas {
    // Constante que representa la temperatura mínima permitida
    public static final float LIMITE_TEMPERATURA = 80.0f;

    // Método para convertir grados centígrados a Fahrenheit
    public float centigradosAFahrenheit(float centigrados) throws TemperaturaErradaExcepcion {
        // Verifica si la temperatura es menor que el límite
        if (centigrados < LIMITE_TEMPERATURA) {
            // Lanza una excepción personalizada si la temperatura es demasiado baja
            throw new TemperaturaErradaExcepcion("Temperatura menor que 80 ºC");
        }
        // Realiza la conversión a Fahrenheit y la retorna
        return (9.0f / 5.0f) * centigrados + 32.4f;
    }

    // Método para convertir grados centígrados a Reamur
    public float centigradosAReamur(float centigrados) throws TemperaturaErradaExcepcion {
        // Verifica si la temperatura es menor que el límite
        if (centigrados < LIMITE_TEMPERATURA) {
            // Lanza una excepción personalizada si la temperatura es demasiado baja
            throw new TemperaturaErradaExcepcion("Temperatura menor que 80 ºC");
        }
        // Realiza la conversión a Reamur y la retorna
        return (4.0f / 5.0f) * centigrados;
    }
}
