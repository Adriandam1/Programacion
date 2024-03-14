/*
 Ejercicio 1: Arrays Multidimensionales

Para este ejercicio, primero necesitas crear un array bidimensional de números enteros y llenarlo con valores aleatorios. Luego, itera sobre este array para encontrar el valor máximo y su posición.
*/
package boletins29;

import java.util.Random;

/**
 *
 * @author Adrian
 */
public class ejercicio1 {

public static void main(String[] args) {
        int filas = 5;
        int columnas = 5;
        int[][] miArray = new int[filas][columnas];
        Random rand = new Random();

        int maxValor = Integer.MIN_VALUE;
        int filaMax = -1, columnaMax = -1;

        // Llenar array y encontrar el valor máximo y su posición
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                miArray[i][j] = rand.nextInt(100); // Valores aleatorios entre 0 y 99
                System.out.print(miArray[i][j] + " ");
                
                if (miArray[i][j] > maxValor) {
                    maxValor = miArray[i][j];
                    filaMax = i;
                    columnaMax = j;
                }
            }
            System.out.println();
        }

        System.out.println("El valor máximo es " + maxValor + " y se encuentra en la fila " + filaMax + " y columna " + columnaMax + ".");
    }
}