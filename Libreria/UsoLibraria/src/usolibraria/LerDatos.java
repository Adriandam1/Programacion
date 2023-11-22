
package usolibraria;

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
    public static String lerString (String mensaxe){
        return JOptionPane.showInputDialog(mensaxe);
    }
    
}
