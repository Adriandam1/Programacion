/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins27;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Usuario
 */
public class Libreria {
    private ArrayList<Libro> libros;
    

    public Libreria(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public Libreria() {
        this.libros = new ArrayList<>();
    }
    
    public void engadirLibro(Libro libro) {
        libros.add(libro);
    }
    
    public void consultarLibro(String nomeLibro){
        
       /* if (nome == null){
            System.out.println("Libro non encontrado");      
        }else{
            System.out.println("O prezo do libro e: "+Libro.);
        }
        
        for (Libro libros : libros) {
            if (Libro.getNome().equalsIgnoreCase(nome) && Libro.getUnidades() > 0) {
                System.out.println("Has seleccionado: " + nome);
                return;
            }else{
                System.out.println("O prezo do libro e: "+Libro.getPrecio);
            }
            
        }*/
        
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getnome().equals(nomeLibro)) {
                System.out.println("Precio de " + nomeLibro + ": " + libro.getPrecio());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("O libro '" + nomeLibro + "' non se encontra na libreria.");
        }  
    }
 // Método para mostrar todos los libros de la librería
    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    // Método para borrar los libros con 0 unidades
    public void borrarLibros() {
        Iterator<Libro> iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            if (libro.getUnidades() == 0) {
                iterator.remove();
            }
        }
    }

    // Método para modificar el precio de un libro por su nombre
    public void modificarPrecio(String nomeLibro, double nuevoPrecio) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getnome().equals(nomeLibro)) {
                libro.setPrecio(nuevoPrecio);
                System.out.println("Precio de " + nomeLibro + " modificado correctamente.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El libro '" + nomeLibro + "' no se encuentra en la librería.");
        }
    }
}    
