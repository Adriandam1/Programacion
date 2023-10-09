/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemploobxetos;

/**
 *
 * @author Adrian
 */
public class Rectangulo {
    private float base;
    private float altura;
    // constructores
    // constructor por defecto
    public Rectangulo(){
        
        
    }
    //metodos de acceso, aqui damos valor base(0) a base
    public void darValorBase(float ba){
        base = ba;
    
    }
    // aqui devolvemos el valor base(0) de base
    public float devolverValorBase(){
        return base;
    }
    public void darValorAltura(float al){
        altura = al;    
    }
    public float devolverValorAltura(){
        return altura;
    }
    public void calcularArea(float ba, float al){
        float area = ba * al;
        System.out.println("area = "+area);
    }
    public float calcularPerimetro(float ba, float al){
        float peri = 2 * ba + 2 * al; // perimetro rectangulo = 2*base + 2*altura
        return peri; // tambien podemos poner: return 2 * ba + 2* al;
    }
    public Rectangulo (float ba, float al){
        base = ba;
        altura = al;
    }
    // Sobrecarga de metodo
}
