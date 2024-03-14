/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins19;

// Definimos una clase llamada Canario que también implementa la interface IPodeCantar.
public class Canario implements IPodeCantar {
    // Implementamos el método cantar().
    @Override
    public void cantar() {
        // Imprimimos un mensaje que simula a un canario cantando.
        System.out.println("Pio Pio Pio");
    }
}