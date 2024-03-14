/*
 Ejercicio 3: Clases Abstractas e Interfaces

 3.2 Interfaces
 */
package boletins29;

/**
 *
 * @author Adrian
 */
public class Motocicleta implements Vehiculo {
    @Override
    public void arrancar() { System.out.println("Motocicleta arrancando."); }
    @Override
    public void detener() { System.out.println("Motocicleta deteniéndose."); }
    @Override
    public void acelerar() { System.out.println("Motocicleta acelerando."); }
}