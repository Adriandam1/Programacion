/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemploobxetos;

/**
 *
 * @author Adrian
 */
public class ExemploObxetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo obxRec = new Rectangulo();
        
        obxRec.darValorBase(5f);
        float va= obxRec.devolverValorBase();
        System.out.println("base = "+va);
        
        obxRec.darValorAltura(10f);
        System.out.println("altura = "+obxRec.devolverValorAltura());
        
        //llamar a calcularArea y como es void le tenemos que dar valores
        obxRec.calcularArea(6f, 7f);
        
        //llamar a calcularPerimetro y le damos los valores 6 y 7
        float r = obxRec.calcularPerimetro(6, 7);
        System.out.println("perimetro = "+r);
        
        //instanciamos un rectangulo con el constructor parametrizado
        Rectangulo obxR = new Rectangulo(12,6);
        System.out.println("base = "+obxR.devolverValorBase());
    }
    
}
