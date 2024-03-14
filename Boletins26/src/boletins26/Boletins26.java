/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletins26;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Boletins26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Operacions<Integer> operaciones = new Operacions<>();
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(3);
        numeros.add(8);
        numeros.add(15);

        // Calcular el mínimo
        System.out.println("Mínimo: " + operaciones.minimo(numeros));

        // Calcular el máximo
        System.out.println("Máximo: " + operaciones.maximo(numeros));

        // Buscar un objeto en la lista
        int indice = operaciones.buscar(numeros, 3);
        if (indice != -1) {
            System.out.println("El objeto se encuentra en la posición " + indice);
        } else {
            System.out.println("El objeto no se encuentra en la lista");
        }

        // Borrar la primera aparición de un objeto en la lista
        boolean borrado = operaciones.borrar(numeros, 8);
        if (borrado) {
            System.out.println("Objeto borrado exitosamente");
        } else {
            System.out.println("El objeto no se encuentra en la lista para ser borrado");
        }
        System.out.println("Lista después de borrar: " + numeros);
    }
}
