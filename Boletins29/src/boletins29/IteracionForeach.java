/*
 Ejercicio 6: Foreach y Collections

 6.1 Iterar sobre un ArrayList

 */
package boletins29;

import java.util.ArrayList;

/**
 *
 * @author Adrian
 */
public class IteracionForeach {
    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<>();
        cadenas.add("Uno");
        cadenas.add("Dos");
        cadenas.add("Tres");
        
        for (String cadena : cadenas) {
            System.out.println(cadena);
        }
    }
}