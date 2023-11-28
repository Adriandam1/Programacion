/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins16;

/**
 *
 * @author Adrian
 */
public class Libro extends Publicacion {
    private boolean prestado;

    public Libro() {
    }

    public Libro(boolean prestado) {
        this.prestado = prestado;
    }

    public Libro(boolean prestado, int codigo, String titulo, int anio) {
        super(codigo, titulo, anio);
        this.prestado = prestado;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return super.toString()+"Libro{" + "prestado=" + prestado + '}';
    }    
    
    
}
