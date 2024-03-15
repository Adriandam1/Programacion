/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenprog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class PokedexImpl implements Pokedex {
    private List<Pokemon> pokemons;
    //private Pokemon[] pokemons;
    private double pokemonAñadido;
    private Pokemon seleccionado; // Pokemon seleccionado por el usuario
    Scanner scanner = new Scanner(System.in);
    

    public PokedexImpl() {
        pokemons = new ArrayList<>();
        //pokemons = new Pokemon[100];
        pokemonAñadido = 0;
        // Agregamos algunos pokemons para tener base
        pokemons.add(new Pokemon("Pikachu","Rayo",100,"Trueno"));
        pokemons.add(new Pokemon("Charmander","Fuego",50, "Hoja afilada"));
        pokemons.add(new Pokemon("Ratata","Normal",2, "Cabezazo, Mordisco"));

    }
int contador=3;
    
    public void buscar(String nombre) {
        boolean pokemonEncontrado = false;
        for (int i = 0; i < contador; i++) {
            if (pokemons.get(i).getNombre().equals(nombre)) {
            System.out.println("Pokemon encontrado: " + pokemons.get(i));
            pokemonEncontrado = true;
            
            }
        }
        if (!pokemonEncontrado){
        System.out.println("El pokemon con nombre " + nombre + " no encontrado.");
        }
    }
    public void agregar(String pokemon, String tipo, String ataques, int nivel) {
        System.out.println("Añadiendo "+pokemon+" a la lista de la pokedex");
        
        pokemons.add(new Pokemon(pokemon,tipo,nivel,ataques));
        contador++;
    }    


    public void mostrarInformacion() {
        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon.toString());
        }
    }
}