/*
 Ejercicio 5: Serialización

Para este ejercicio, primero definimos la clase `Empleado` y luego escribimos un programa que serializa y deserializa una lista de empleados.

 */
package boletins29;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Adrian
 */
public class SerializacionEmpleado {
public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        // Añadir empleados a la lista
        
        // Serialización
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empleados.ser"))) {
            oos.writeObject(empleados);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialización
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empleados.ser"))) {
            empleados = (ArrayList<Empleado>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}