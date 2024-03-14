/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins28;

public class Caja<T> {
    private T objeto;

    public void agregar(T objeto) {
        this.objeto = objeto;
    }

    public T obtener() {
        return objeto;
    }
}