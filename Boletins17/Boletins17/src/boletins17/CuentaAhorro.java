/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins17;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class CuentaAhorro extends Conta{
    public double intereseVar;
    public double saldoMin;
    
    Scanner sc = new Scanner(System.in);

    public CuentaAhorro() {
    }  
    
    
    public CuentaAhorro(double intereseVar, double saldoMin) {
        this.intereseVar = intereseVar;
        this.saldoMin = saldoMin;
    }

    public CuentaAhorro(double intereseVar, double saldoMin, long numeroConta, double saldo, Persoa cliente) {
        super(numeroConta, saldo, cliente);
        this.intereseVar = intereseVar;
        this.saldoMin = saldoMin;
    }

    @Override
    public String toString() {
        return "CuentaAhorro intereseVar: " + intereseVar + ", saldoMin: " + saldoMin;
    }

    
    
    public void cambiarInterese(){
        System.out.println("Cal e interese da conta?");
        intereseVar = sc.nextDouble();
        System.out.println("O interese e: "+intereseVar+" %");
    }
    
    
}
