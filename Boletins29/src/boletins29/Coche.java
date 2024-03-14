/*
 Ejercicio 3: Clases Abstractas e Interfaces

 3.2 Interfaces
 */
package boletins29;

/**
 *
 * @author Adrian
 */
public class Coche implements Vehiculo {
    @Override
    public void arrancar() { System.out.println("Coche arrancando."); }
    @Override
    public void detener() { System.out.println("Coche deteniéndose."); }
    @Override
    public void acelerar() { System.out.println("Coche acelerando."); }
}
