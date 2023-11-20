/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partes;

/**
 *
 * @author Adrian
 */
public class Procesador {
    float velocidade;

    public Procesador() {
    }

    public Procesador(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Procesador{" + "velocidade=" + velocidade + '}';
    }
    
    
}
