/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins28;

import java.util.ArrayList;
import java.util.List;

public class GestorDeEmpleados {
private Empleado[] empleados;
private int contador; // Para llevar el control de la cantidad de empleados actualmente en el array

public GestorDeEmpleados(int tamaño) {
empleados = new Empleado[tamaño];
contador = 0;
}

public void agregarEmpleado(Empleado empleado) {
if (contador < empleados.length) {
empleados[contador] = empleado;
contador++;
} else {
System.out.println("No hay espacio para agregar más empleados.");
}
}

public void mostrarEmpleados() {
for (int i = 0; i < contador; i++) {
System.out.println(empleados[i]);
}
}

public void buscarEmpleadoPorNombre(String nombre) {
boolean empleadoEncontrado = false;// para saber si hemos encontrado al menos un empleado
for (int i = 0; i < contador; i++) {
if (empleados[i].getNombre().equals(nombre)) {
System.out.println("Empleado encontrado: " + empleados[i]);
empleadoEncontrado = true; // Indicamos que hemos encontrado al menos un empleado
}
}
if (!empleadoEncontrado){ //Si despues de buscar no encuntra ningun empleado
System.out.println("Empleado con nombre " + nombre + " no encontrado.");
}
}
}


//-----------------------------------------------
public class GestorDeEmpleados implements Administrable<Empleado> {
    private List<Empleado> empleados = new ArrayList<>();

    @Override
    public void agregar(Empleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public void eliminar(Empleado empleado) {
        empleados.remove(empleado);
    }

    @Override
    public void listar() {
        empleados.forEach(empleado -> System.out.println(empleado));
    }

    // Método para asignar un instrumento a un empleado
    /*public void asignarInstrumentoAEmpleado(String nombreEmpleado, InstrumentoMusical instrumento) {
        empleados.stream()
        .filter(empleado -> empleado.getNombre().equals(nombreEmpleado))
        .findFirst()
        .ifPresent(empleado -> {
        System.out.println(nombreEmpleado + " está " + instrumento.tocar())
        });
    }*/
    
}