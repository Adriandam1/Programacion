/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins16;

/**
 *
 * @author Adrian
 */
public class Revista extends Publicacion{
    private int numero;

    public Revista() {
    }

    public Revista(int numero) {
        this.numero = numero;
    }

    public Revista(int numero, int codigo, String titulo, int anio) {
        super(codigo, titulo, anio);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return super.toString()+"Revista{" + "numero=" + numero + '}';
    }
    
    
    
}
