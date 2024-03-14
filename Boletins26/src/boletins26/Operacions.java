/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins26;

import java.util.List;

public class Operacions <T extends Comparable <T>> {
  // Método para calcular el elemento mínimo de una lista
    public T minimo(List<T> lista) {
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("La lista está vacía");
        }
        T min = lista.get(0);
        for (T elemento : lista) {
            if (elemento.compareTo(min) < 0) {
                min = elemento;
            }
        }
        return min;
    }

    // Método para calcular el elemento máximo de una lista
    public T maximo(List<T> lista) {
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("La lista está vacía");
        }
        T max = lista.get(0);
        for (T elemento : lista) {
            if (elemento.compareTo(max) > 0) {
                max = elemento;
            }
        }
        return max;
    }

    // Método para buscar un objeto en la lista y devolver su posición
    public int buscar(List<T> lista, T objeto) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(objeto)) {
                return i;
            }
        }
        return -1;
    }

    // Método para borrar la primera aparición de un objeto en la lista
    public boolean borrar(List<T> lista, T objeto) {
        return lista.remove(objeto);
    }
}
