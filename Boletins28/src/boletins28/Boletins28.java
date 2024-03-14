/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletins28;

/**
 *
 * @author Usuario
 */
public class Boletins28 {

    public static void main(String[] args) {
        GestorDeEmpleados gestor = new GestorDeEmpleados(5);

        gestor.agregarEmpleado(new Empleado("Juan", "Contabilidad", 3000));
        gestor.agregarEmpleado(new Empleado("Ana", "Marketing", 3500));
        gestor.agregarEmpleado(new Empleado("Luis", "IT", 4000));

        System.out.println("Lista de Empleados:");
        gestor.mostrarEmpleados();

        System.out.println("\nBúsqueda de Empleado por Nombre:");
        gestor.buscarEmpleadoPorNombre("Ana");
        
        // Uso con Integer
        Caja<Integer> cajaInteger = new Caja<>();
        cajaInteger.agregar(123);
        System.out.println("Contenido de cajaInteger: " + cajaInteger.obtener());

        // Uso con String
        Caja<String> cajaString = new Caja<>();
        cajaString.agregar("Hola Mundo");
        System.out.println("Contenido de cajaString: " + cajaString.obtener());

        // Uso con Empleado
        Caja<Empleado> cajaEmpleado = new Caja<>();
        cajaEmpleado.agregar(new Empleado("Carlos", "Desarrollo", 5000));
        System.out.println("Contenido de cajaEmpleado: " + cajaEmpleado.obtener());
        
        Circulo circulo = new Circulo(5); // Supongamos que el radio es 5
        Rectangulo rectangulo = new Rectangulo(10, 4); // Supongamos que la base es 10 y la altura es 4

        System.out.println("El área del círculo es: " + circulo.calcularArea());
        System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
        
        Caja<FiguraGeometrica> cajaFiguras = new Caja<>();
        cajaFiguras.agregar(new Circulo(5)); // Suponiendo que el radio es 5
        cajaFiguras.agregar(new Rectangulo(10, 4)); // Suponiendo que la base es 10 y la altura es 4

        // Listar y manipular figuras
        FiguraGeometrica figura = cajaFiguras.obtener();
        System.out.println("El área de la figura es: " + figura.calcularArea());

        /*
        // Integración con InstrumentoMusical
        GestorDeEmpleados gestor = new GestorDeEmpleados();
        gestor.agregar(new Empleado("Juan", "Desarrollo", 5000));
        gestor.listar();
        gestor.asignarInstrumentoAEmpleado("Juan", new Guitarra());
        }
        }*/

        

    }
}
