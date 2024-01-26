/*
Ejercicio 1 array bidimensional
Enunciado 1: Tablero de Ajedrez
Objetivo: Crear y manejar un array bidimensional que represente un tablero de ajedrez.

Descripción:

Define un array bidimensional tablero de 8x8 que represente un tablero de ajedrez. Cada celda del tablero puede contener una pieza de ajedrez representada por una cadena de texto, como "Rey", "Peón", etc., o estar vacía, representada por una cadena vacía "".
Inicializa el tablero colocando las piezas en sus posiciones iniciales. Por ejemplo, puedes colocar "Torre" en tablero[0][0] y tablero[0][7].
Muestra el estado inicial del tablero imprimiendo el array en la consola.
 */
package array_bidimensional_ejercicio1;

import static java.lang.System.console;

/**
 *
 * @author Adrian
 */
public class Array_bidimensional_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro el array del tablero
        String [][] tablero = new String [8][8];
        //Asigno los nombres a las piezas
        String t=" Torre "; String c="Caballo"; String a=" Alfil "; String r=" Reina "; String rey="  Rey  ";String p=" Peon  "; String vacio="       ";

        
        
        //Dibujo el tablero en su estado original
        tablero[0][0]=t;tablero[0][1]=c;tablero[0][2]=a;tablero[0][3]=r;tablero[0][4]=rey;tablero[0][5]=a;tablero[0][6]=c;tablero[0][7]=t;        
        tablero[1][0]=p;tablero[1][1]=p;tablero[1][2]=p;tablero[1][3]=p;tablero[1][4]=p;tablero[1][5]=p;tablero[1][6]=p;tablero[1][7]=p;
        //tablero[2][0]=vacio;tablero[2][1]=vacio;tablero[2][2]=vacio;tablero[2][3]=vacio;tablero[2][4]=vacio;tablero[2][5]=vacio;tablero[2][6]=vacio;tablero[2][7]=vacio;
        //tablero[3][0]=vacio;tablero[3][1]=vacio;tablero[3][2]=vacio;tablero[3][3]=vacio;tablero[3][4]=vacio;tablero[3][5]=vacio;tablero[3][6]=vacio;tablero[3][7]=vacio;
        //tablero[4][0]=vacio;tablero[4][1]=vacio;tablero[4][2]=vacio;tablero[4][3]=vacio;tablero[4][4]=vacio;tablero[4][5]=vacio;tablero[4][6]=vacio;tablero[4][7]=vacio;
        //tablero[5][0]=vacio;tablero[5][1]=vacio;tablero[5][2]=vacio;tablero[5][3]=vacio;tablero[5][4]=vacio;tablero[5][5]=vacio;tablero[5][6]=vacio;tablero[5][7]=vacio;
        tablero[6][0]=p;tablero[6][1]=p;tablero[6][2]=p;tablero[6][3]=p;tablero[6][4]=p;tablero[6][5]=p;tablero[6][6]=p;tablero[6][7]=p;        
        tablero[7][0]=t;tablero[7][1]=c;tablero[7][2]=a;tablero[7][3]=r;tablero[7][4]=rey;tablero[7][5]=a;tablero[7][6]=c;tablero[7][7]=t;
        
        // Los espacios vacíos se representan con cadenas vacías, permite no tener que poner las celdas vacias
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tablero[i][j] == null) {
                    tablero[i][j] = "       ";
                }
            }
        }
        
        //Muestro el tablero con for, añado linea horizontal separadora
        for (int x=0; x < tablero.length; x++){
            for (int y=0; y < tablero[x].length; y++)
            System.out.print(" | " + tablero[x][y]+ " | ");   
        System.out.println("\n ------------------------------------------------------------------------------------------------------");

}
        
        
        
    }
    
}
