/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Libreria {
    private ArrayList<Libro> libros;

    // Constructor
    public Libreria() {
        this.libros = new ArrayList<>();
    }

    // Métodos de la librería
    public void engadirLibro(Libro libro) {
        libros.add(libro);
        ordenarPorTitulo();
    }

    public void venderLibro(String ISBN) {
        if (libros == null) {
            throw new NullPointerException("No hay libros en la librería");
        }
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getISBN().equals(ISBN)) {
                libros.remove(i);
                break;
            }
        }
    }

    public void amosarLibros() {
        if (libros == null) {
            throw new NullPointerException("No hay libros en la librería");
        }
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void baixas() {
        if (libros == null) {
            throw new NullPointerException("No hay libros en la librería");
        }
        libros.removeIf(libro -> libro.getUnidades() == 0);
    }

    public void consultarLibro(String ISBN) {
        if (libros == null) {
            throw new NullPointerException("No hay libros en la librería");
        }
        for (Libro libro : libros) {
            if (libro.getISBN().equals(ISBN)) {
                System.out.println(libro);
                return;
            }
        }
        System.out.println("Libro no encontrado");
    }

    private void ordenarPorTitulo() {
        Collections.sort(libros, Comparator.comparing(Libro::getTitulo));
    }
}