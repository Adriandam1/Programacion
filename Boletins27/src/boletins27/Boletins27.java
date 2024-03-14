/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletins27;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Boletins27 {


    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("a) Añadir libro");
            System.out.println("b) Consultar precio");
            System.out.println("c) Mostrar libros");
            System.out.println("d) Borrar libros con 0 unidades");
            System.out.println("e) Modificar precio de un libro");
            System.out.println("f) Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextLine().charAt(0);

            switch (opcion) {
                case 'a':
                    System.out.print("Introduce el nombre del libro: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Introduce el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Introduce el precio del libro: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Introduce el número de unidades del libro: ");
                    int unidades = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    libreria.engadirLibro(new Libro(nombre, autor, precio, unidades));
                    break;
                case 'b':
                    System.out.print("Introduce el nombre del libro a consultar: ");
                    String nombreConsulta = scanner.nextLine();
                    libreria.consultarLibro(nombreConsulta);
                    break;
                case 'c':
                    System.out.println("Listado de libros:");
                    libreria.mostrarLibros();
                    break;
                case 'd':
                    libreria.borrarLibros();
                    System.out.println("Libros con 0 unidades borrados correctamente.");
                    break;
                case 'e':
                    System.out.print("Introduce el nombre del libro a modificar: ");
                    String nombreModificar = scanner.nextLine();
                    System.out.print("Introduce el nuevo precio del libro: ");
                    double nuevoPrecio = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el salto de línea
                    libreria.modificarPrecio(nombreModificar, nuevoPrecio);
                    break;
                case 'f':
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 'f');

        scanner.close();
    }
}