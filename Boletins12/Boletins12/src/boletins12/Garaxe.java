/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins12;


/**
 *
 * @author Adrian
 */
public class Garaxe {
    static int numeroCoches;
    Coche coche;

    public Garaxe() {
    }

    public Garaxe(Coche coche) {
        this.coche = coche;
    }

    public static int getNumeroCoches() {
        return numeroCoches;
    }

    public static void setNumeroCoches(int numeroCoches) {
        Garaxe.numeroCoches = numeroCoches;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
    
    
    
}
