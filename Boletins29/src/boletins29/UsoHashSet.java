/*
 6.2 Uso de HashSet y Iterator
 */
package boletins29;


import java.util.HashSet;
import java.util.Iterator;

public class UsoHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        
        // Eliminar el número 2
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            if (numero == 2) {
                iterator.remove();
            }
        }
        
        // Mostrar el HashSet después de eliminar
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}