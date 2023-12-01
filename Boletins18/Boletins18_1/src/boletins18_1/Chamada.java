/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins18_1;

import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian
 */
public class Chamada {
    int durChamada;
    float imposto;
    float custo;

    public Chamada() {
    }

    public Chamada(int durChamada, float imposto, float custo) {
        this.durChamada = durChamada;
        this.imposto = imposto;
        this.custo = custo;
    }

    public int getDurChamada() {
        return durChamada;
    }

    public void setDurChamada(int durChamada) {
        this.durChamada = durChamada;
    }

    public float getImposto() {
        return imposto;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    @Override
    public String toString() {
        return "Chamada{" + "durChamada=" + durChamada + ", imposto=" + imposto + ", custo=" + custo + '}';
    }
    
    public void calcularImposto(){
        String hora="null";
        durChamada = Integer.parseInt(JOptionPane.showInputDialog("Indique a duracion da chamada: "));
        String domingo = JOptionPane.showInputDialog("É domingo!? (");
        if (domingo.equalsIgnoreCase ("si")){
        //JOptionPane.showMessageDialog(null,"Es domingo");
        imposto = (float) 1.03;
        }
        else {
            hora = JOptionPane.showInputDialog("É de mañá!? (");
            if (hora.equalsIgnoreCase ("si")){
            //JOptionPane.showMessageDialog(null,"Es por la mañana");
            imposto = (float) 1.15;
            }else{
            //JOptionPane.showMessageDialog(null,"Es por la tarde");
            imposto = (float) 1.10;}}
    }
    
    public void calcularCusto(){
        if (durChamada <= 5){
            custo = durChamada;
            }else if (durChamada >5 && durChamada <= 8){
                custo = (float) (5 + 0.8 * durChamada);
                }else if (durChamada >8 && durChamada <=10){
                     custo = (float) (5 + 2.4 + 0.7 * durChamada);
                    }else{
                    custo = (float) (5 + 2.4 + 1.4 + 0.5 * durChamada);}
        custo = custo * imposto;
        JOptionPane.showMessageDialog(null,"o custo da chamada e: "+custo);
        
        
    }
    
    
}
