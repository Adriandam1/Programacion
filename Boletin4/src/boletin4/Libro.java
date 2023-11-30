/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin4;

/**
 *
 * @author Usuario
 */
public class Libro {
    String titulo;
    String autor;
    int ano;
    short numPaginas;
    float valoracion;

    public Libro() {
    }

    public Libro(String titulo, String autor, int ano, short numPaginas, float valoracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;
        this.valoracion = valoracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + ", numPaginas=" + numPaginas + ", valoracion=" + valoracion + '}';
    }
    
    public void amosar(String titulo, String autor, int ano, short numPaginas, float valoracion){
        System.out.println(titulo+" "+autor+" "+ano+" "+numPaginas+" "+valoracion);
    }
    
}
