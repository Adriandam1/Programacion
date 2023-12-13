
package usolibraria;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian
 */
public class LerDatos {
    
    public static int lerEnteiro (String mensaxe){
        int resposta = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        return resposta;        
     //   seria lo mismo la siguiente linea, son diferentes maneras de ponerlo
     //   return Integer.parseInt(JOptionPane.showInputDialog(mensaxe))
     
    }
    public static float lerFloatPositivo(String mensaxe){
        float dato;
        do{
            dato = Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        }while(dato <=0);
    return dato;
    
    }
    //Esto nos abre un jpane que podemos editar titulo e introducir un mensaxe
    public static String lerString (String mensaxe){
        return JOptionPane.showInputDialog(mensaxe);
    }
    
    public static String introducirString (){
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        return texto;
    }
   
    
        public static short introducirShort (){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Introduzca un numero entero: ");
        short numshort = sc.nextShort();
        return numshort;
    }
    
    
    public static int introducirInteger (){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Introduzca un numero entero: ");
        int entero = sc.nextInt();
        return entero;
    }
    
    //introducir numero entero positivo
    public static int introducirIntegerPositivo (){
        int enteropositivo;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Introduza un numero entero positivo: ");
        enteropositivo = sc.nextInt();
        }while (enteropositivo < 0);
        return enteropositivo;
    }
    
    public static float introducirFloat (){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Introduzca un numero entero: ");
        float numFloat = sc.nextFloat();
        return numFloat;
    }
    
        public static double introducirDouble (){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Introduzca un numero entero: ");
        double numDouble = sc.nextDouble();
        return numDouble;
    }
    
        public static long introducirLong (){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Introduzca un numero entero: ");
        long numLong = sc.nextLong();
        return numLong;
    }
        
        public void hagoUnSwitch(){
            int menu = 0;
            switch (menu){
                case 1:
                
                break;
                case 2:
                
                break;
                case 3:
                
                break;
                case 4:
                
                break;
                case 5:
                
                break;
                default:
                System.out.println("Error indique opciones 1-5");
        }  
        }
        public void hagoBucleFor(){
            
            for (int i =0; i<7;i++){
                System.out.println("DAM1");
            }
            System.out.println("Saimos do bucle for");
        }
        
        
        
}
