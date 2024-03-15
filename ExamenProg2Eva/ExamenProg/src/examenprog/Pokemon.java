/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprog;

/**
 *
 * @author Adrian
 */
public class Pokemon {
    String nombre;
    String tipo;
    int nivel;
    String ataques;

    public Pokemon(String nombre, String tipo, int nivel, String ataques) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.ataques = ataques;
    }   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getAtaques() {
        return ataques;
    }

    public void setAtaques(String ataques) {
        this.ataques = ataques;
    }

    @Override
    public String toString() {
        return "Pokemon: " + "nombre " + nombre + ", tipo " + tipo + ", nivel " + nivel + ", ataques " + ataques;
    }
    
    
    
    
    
}
