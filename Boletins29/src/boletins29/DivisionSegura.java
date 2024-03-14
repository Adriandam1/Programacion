 /*Ejercicio 4: Manejo de Excepciones

Este ejercicio te pide que escribas un programa que realice una división de dos números introducidos por el usuario, manejando adecuadamente las excepciones para división por cero y entradas no válidas.
*/

import java.util.InputMismatchException;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce el numerador: ");
            int numerador = scanner.nextInt();
            System.out.print("Introduce el denominador: ");
            int denominador = scanner.nextInt();
            
            int resultado = numerador / denominador;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor, introduce un número válido.");
        } finally {
            scanner.close();
        }
    }
}