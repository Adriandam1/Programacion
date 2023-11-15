/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins12;

/**
 *
 * @author Adrian
 */
public class Coche {
    String matricula;
    String marca;

    public Coche() {
        Garaxe.numeroCoches++;
    }

    public Coche(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
        Garaxe.numeroCoches++;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Coche{" + "matricula=" + matricula + ", marca=" + marca + '}';
    }
    
}
