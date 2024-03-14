/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins20;

// Felino es una subclase de Mamifero y también implementa IPodeNadar.
public class Felino extends Mamifero implements IPodeNadar {
    @Override
    public void nadar() {
        System.out.println("Felino nada");
    }
}