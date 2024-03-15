/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprog;

/**
 *
 * @author Adrian
 */
public interface Pokedex {
    
    public void agregar(String pokemon, String tipo, String ataques, int nivel);
    public void buscar(String nombre);
    public void mostrarInformacion();
    
}
