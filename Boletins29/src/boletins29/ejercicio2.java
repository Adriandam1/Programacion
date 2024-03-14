/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins29;

public class ejercicio2<T> {
    private T objeto;

    public void set(T objeto) {
        this.objeto = objeto;
    }

    public T get() {
        return objeto;
    }

    public static void main(String[] args) {
        ejercicio2<Integer> cajaEntero = new ejercicio2<>();
        cajaEntero.set(123);

        ejercicio2<String> cajaCadena = new ejercicio2<>();
        cajaCadena.set("Hola Mundo");

        System.out.println("Valor en cajaEntero: " + cajaEntero.get());
        System.out.println("Valor en cajaCadena: " + cajaCadena.get());
    }
}