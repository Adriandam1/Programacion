/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins28;

public interface Administrable<T> {
    void agregar(T elemento);
    void eliminar(T elemento);
    void listar();
}