/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins19;

// Definimos una clase llamada Persoa que implementa la interface IPodeCantar.
public class Persoa implements IPodeCantar {
    // Implementamos el método cantar() de la interface.
    @Override
    public void cantar() {
        // Imprimimos un mensaje que simula a una persona cantando.
        System.out.println("Do Re Mi Fa Sol La Si");
    }
}