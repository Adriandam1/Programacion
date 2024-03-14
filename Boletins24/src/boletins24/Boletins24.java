/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletins24;

import java.util.Scanner;


public class Boletins24 {

   public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Engadir libro");
            System.out.println("2. Vender libro");
            System.out.println("3. Amosar libros");
            System.out.println("4. Dar de baixa libros");
            System.out.println("5. Consultar libro");
            System.out.println("6. Saír");
            System.out.print("Escolle unha opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    engadirLibro(libreria, scanner);
                    break;
                case 2:
                    venderLibro(libreria, scanner);
                    break;
                case 3:
                    amosarLibros(libreria);
                    break;
                case 4:
                    libreria.baixas();
                    System.out.println("Baixas realizadas");
                    break;
                case 5:
                    consultarLibro(libreria, scanner);
                    break;
                case 6:
                    System.out.println("Saíndo do programa...");
                    break;
                default:
                    System.out.println("Opción non válida");
            }
        } while (opcion != 6);

        scanner.close();
    }

    private static void engadirLibro(Libreria libreria, Scanner scanner) {
        System.out.println("\nEngadir libro:");
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("ISBN: ");
        String ISBN = scanner.nextLine();
        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        System.out.print("Número de unidades: ");
        int unidades = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Libro libro = new Libro(titulo, autor, ISBN, precio, unidades);
        libreria.engadirLibro(libro);
        System.out.println("Libro engadido correctamente");
    }

    private static void venderLibro(Libreria libreria, Scanner scanner) {
        System.out.println("\nVender libro:");
        System.out.print("Introduce o ISBN do libro a vender: ");
        String ISBN = scanner.nextLine();
        libreria.venderLibro(ISBN);
        System.out.println("Libro vendido correctamente");
    }

    private static void amosarLibros(Libreria libreria) {
        System.out.println("\nLibros na librería:");
        libreria.amosarLibros();
    }

    private static void consultarLibro(Libreria libreria, Scanner scanner) {
        System.out.println("\nConsultar libro:");
        System.out.print("Introduce o ISBN do libro a consultar: ");
        String ISBN = scanner.nextLine();
        libreria.consultarLibro(ISBN);
    }
}
