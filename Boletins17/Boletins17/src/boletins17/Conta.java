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
public class Conta {
    private long numeroConta;
    private double saldo;
    private Persoa cliente;

    Scanner sc = new Scanner(System.in);
    public Conta() {
    } 
    

    public Conta(long numeroConta, double saldo, Persoa cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persoa getCliente() {
        return cliente;
    }

    public void setCliente(Persoa cliente) {
        this.cliente = cliente;
    }

    public double ingresar(){
        
        System.out.println("Indique canto ingresa: ");
        double ingreso = sc.nextDouble();
        if (ingreso >0){
        saldo= saldo + ingreso;
        System.out.println("O saldo e: "+saldo+" €");
        }else{
            System.out.println("Os ingresos nos poden ser en negativo");
            ingresar();
        }
        return saldo;
    }
    public double retirar(){
        
        System.out.println("Indique canto retirar: ");
        double retirada= sc.nextDouble();
        saldo = saldo - retirada;
        System.out.println("O saldo e: "+saldo+" €");
        
        return saldo;
       
    }
    public void actualizarSaldo(){
        CuentaCorriente obxC = new CuentaCorriente();
        CuentaAhorro obxC2 = new CuentaAhorro();
        System.out.println("Conta corriente ou de ahorro?\nPara conta corriente prema: \t1\nPara conta de ahorro prema: \t2");
        int tipoconta= sc.nextInt();
        if (tipoconta ==1){
        System.out.println(obxC);}
        
        else if (tipoconta ==2){
        System.out.println("cuenta ahorro");
        obxC2.cambiarInterese();}
        
        else{
            System.out.println("opcion incorrecta");
            actualizarSaldo();
        }
        
        
        
    }
}
