/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins19;

// Definimos una interface llamada IPodeCantar.
// Las interfaces son como "contratos" que otras clases pueden "firmar" (implementar).
public interface IPodeCantar {
    // Declaramos un método abstracto llamado cantar().
    // Este método no tiene cuerpo y debe ser implementado por cualquier clase que implemente esta interface.
    void cantar();
}