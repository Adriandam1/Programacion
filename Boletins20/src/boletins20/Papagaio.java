/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins20;

// Papagaio es una subclase de Aves e implementa IPodeVoar.
public class Papagaio extends Aves implements IPodeVoar {
    @Override
    public void voar() {
        System.out.println("Papagaio vuela");
    }
}