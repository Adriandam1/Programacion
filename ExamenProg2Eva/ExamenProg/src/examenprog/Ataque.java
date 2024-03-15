/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprog;

/**
 *
 * @author Adrian
 */
public class Ataque {
    String nombre;
    String tipo;
    int poder;

    public Ataque(String nombre, String tipo, int poder) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.poder = poder;
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

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "Ataque{" + "nombre=" + nombre + ", tipo=" + tipo + ", poder=" + poder + '}';
    }
    
    
    
    
    
}
