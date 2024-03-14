/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins20;

// Morcego es una subclase de Mamifero e implementa IPodeVoar.
public class Morcego extends Mamifero implements IPodeVoar {
    @Override
    public void voar() {
        System.out.println("Morcego vuela");
    }
}