/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenprog;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class ExamenProg {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        PokedexImpl pokedexim = new PokedexImpl();
        Scanner scanner = new Scanner(System.in);
        int opcion;

    try {
        do {
            System.out.println("\nPokedex en creacion");
            //Mostrar array de pokemons: pokedexim.mostrarInformacion();
            System.out.println("1. Buscar pokemon");
            System.out.println("2. Agregar pokemon");
            System.out.println("3. Mostrar informacion");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1:
                    System.out.print("Nombre del pokemon: ");
                    String nombrePokemon = scanner.nextLine();
                    pokedexim.buscar(nombrePokemon);
                    break;
                case 2:
                    System.out.print("Que pokemon vas a meter: ");
                    String pokemon = scanner.nextLine();
                    
                    System.out.println("Que tipo es?: ");
                    String tipo = scanner.nextLine();
                    
                    System.out.println("Cual es su ataque principal?: ");
                    String ataques = scanner.nextLine();
                    
                    System.out.println("Que nivel tiene?(1-100): ");
                    int nivel = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    
                    pokedexim.agregar(pokemon,tipo,ataques,nivel);
                    break;
                case 3:
                    pokedexim.mostrarInformacion();
                    break;
                case 4:
                    System.out.println("Gracias por usar la Pokedex.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        //scanner.close();
    } catch (InputMismatchException e) {
                System.out.println("Opcion no valida... las opciones van de 1 a 4");
            }finally {
            System.out.println("Apagando Pokedex para ahorrar bateria");
        }
   
  }
}
