/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletins22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Boletins22 {

    public static void main(String[] args) {
        String[] equipos = {"Celta", "Bilbao", "Malaga"};
        int[][] goles = {
        {3, 4, 2}, // Goles de Celta en X1, X2, X3
        {1, 2, 1}, // Goles de Bilbao en X1, X2, X3
        {3, 0, 1} // Goles de Malaga en X1, X2, X3
        };
        
        // imprimimos la tabla
        System.out.println("Equipo/xornada:\tX1\t\tX2\t\tX3");
        for (int x=0; x < goles.length; x++){
        for (int y=0; y < goles[x].length; y++)
              System.out.print("\t\t" + goles[x][y]);   
        System.out.println("\n");}

        // Calculamos el total de goles por equipo
        Map<String, Integer> totalGolesPorEquipo = new HashMap<>();
        for (int i = 0; i < equipos.length; i++) {
        int suma = 0;
        for (int j = 0; j < goles[i].length; j++) {
        suma += goles[i][j];
        }
        totalGolesPorEquipo.put(equipos[i], suma);
        }

        // Ordenamos los equipos por el total de goles
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(totalGolesPorEquipo.entrySet());
        listaOrdenada.sort(Map.Entry.comparingByValue());

        // Mostramos los equipos ordenados por total de goles
        System.out.println("Equipos ordenados por total de goles de menor a mayor:");
        for (Map.Entry<String, Integer> entry : listaOrdenada) {
        System.out.println(entry.getKey() + ": " + entry.getValue() + " goles");
        }
        
        // Mostar equipo con mas goles por jornada
        System.out.println("\nEquipo con más goles por jornada:"); 
        for (int j = 0; j < 3; j++) { 
            // Para cada jornada 
            int maxGoles = 0; String equipoMaxGoles = ""; for (int i = 0; i < goles.length; i++) { 
                // Buscar el equipo con más goles 
                if (goles[i][j] > maxGoles) {
                     maxGoles = goles[i][j];
                    equipoMaxGoles = equipos[i]; 
                } 
            } 
            System.out.println("Jornada " + (j + 1) + ": " + equipoMaxGoles);
        }
        //Mostrar el maximo de goles en una jornada y que equipo fue
        int maxGolesTotal = 0;
        String equipoMaxGolesTotal = "";
        int jornadaMaxGoles = 0;
        for (int i = 0; i < goles.length; i++) {
            for (int j = 0; j < goles[i].length; j++) {
                if (goles[i][j] > maxGolesTotal) {
                maxGolesTotal = goles[i][j];
                equipoMaxGolesTotal = equipos[i];
                jornadaMaxGoles = j + 1;
                }
            }
        }
         System.out.println("\nEl máximo de goles (" + maxGolesTotal + ") fue marcado por " + equipoMaxGolesTotal + " en la jornada " + jornadaMaxGoles);
    
        // Ejemplo de consulta por equipo y jornada (requiere Scanner para interacción real)
        int indiceEquipo = 0; // Para Celta, como ejemplo
        int xornada = 2; // Para la jornada 3 (recuerda que los índices empiezan en 0)
        System.out.println("\n");
        System.out.println("Goles de " + equipos[indiceEquipo] + " en la jornada " + xornada + ": " + goles[indiceEquipo][xornada-1]);
        
    }
}