/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin5;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class consumo {
    //Implementa unha clase consumo, que forma parte da centralita electrónica dun coche e ten as seguintes características :
    // Atributos :
    // km : kilómetros percorridos polo coche
    // litros : Litros de combustible consumidos
    // vMed: velocidade media
    // pGas : Prezo da gasolina
    public float km, litros, pGas, vmed;
    
    // Dous constructores , un con parámetros e outro sen eles, que inicializan os  valores dos atributos
    public consumo(){
            }
    public consumo(float km,float litros,float pgas, int vmed){
        
    }
    // getTempo Indica o tempo empregado en realizar a viaxe.
    public float getTempo(float km, float vmed){
        float tiempo = km * vmed;
        return tiempo;
    }
    // consumoMedio consumo medio do vehículo ( en litros cada 100 km )
    public float consumoMedio(float litros, float km){
        float consumolitros = (litros / km);
        //System.out.println("O consumo medio do vehiculo e: "+consumolitros+" litros cada 100 km");
        return consumolitros;
    }
    // consumoEuros consumo medio( en € cada 100 km )
    public float consumoEuros(float consumolitros, float pGas){
        float consumoeuros = consumolitros * pGas;
        // System.out.println("O consumo "+consumoeuros+" € cada 100 km");
        return consumoeuros;
    }
    // setKms modifica o valor dos km
    public void setKms(float k){
        km = k;       
    }
    // setLitros modifica o valor dos litros
    public void setLitros(int lit){
        litros = lit;  
    }    
    // setvMed modifica o valor dos vMed
    public void setvMed(float med){
        vmed = med;
    }
    // setPGas modifica o valor dos PGas
    public void setPGas(float gas){
        pGas = gas;
    }
}
