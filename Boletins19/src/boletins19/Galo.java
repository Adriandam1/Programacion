/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins19;

// Definimos otra clase llamada Galo (gallo en gallego) que implementa la interface IPodeCantar.
public class Galo implements IPodeCantar {
    // Implementamos el método cantar().
    @Override
    public void cantar() {
        // Imprimimos un mensaje que simula a un gallo cantando.
        System.out.println("Quiquiriquí");
    }
}