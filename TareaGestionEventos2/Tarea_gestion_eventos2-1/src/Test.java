/*
Enunciado 1: Temporizador con Mensaje Personalizado
Objetivo: Crear un programa que utilice un javax.swing.Timer para ejecutar
una tarea repetitiva cada cierto intervalo de tiempo. La tarea será mostrar
un mensaje personalizado en la consola. Este mensaje puede variar
dependiendo de una condición específica definida por el usuario.
Utilizaremos una clase anónima para definir la acción que realizará el
temporizador.
Requisitos:
Utilizar javax.swing.Timer para crear un temporizador que se ejecute cada 2
segundos.
Definir un mensaje predeterminado que se mostrará en cada tick del
temporizador.
Implementar una condición simple (por ejemplo, relacionada con el número
de veces que se ha mostrado el mensaje) para cambiar el mensaje después
de cierto número de iteraciones.
Utilizar una clase anónima para definir la acción del temporizador.
Asegurar que el programa maneje posibles excepciones adecuadamente.
*/


import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        // Definir el temporizador con un intervalo de 2 segundos
        Timer timer = new Timer(2000, new ActionListener() {
            int contador = 1; // Contador para llevar el control de las iteraciones

            @Override
            public void actionPerformed(ActionEvent e) {
                // Definir el mensaje predeterminado
                String mensaje = "Mensaje predeterminado "+contador;

                // Incrementar el contador en cada tick del temporizador
                contador++;

                // Cambiar el mensaje después de cierto número de iteraciones
                if (contador % 4 == 0) {
                    mensaje = "Mensaje ya se cumplio condicion tercera ";
                }

                // Mostrar el mensaje en la consola
                System.out.println(mensaje);
            }
        });

        // Iniciar el temporizador
        timer.start();

        // Detener el temporizador después de cierto tiempo (por ejemplo, 10 segundos)
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
        }

        // Detener el temporizador al finalizar
        timer.stop();
    }
}