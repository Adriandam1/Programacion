/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins17;

/**
 *
 * @author Adrian
 */
public class CuentaCorriente extends Conta{
    public static final double interese = 1.5;

    public CuentaCorriente() {
    }    
    
    public CuentaCorriente(long numeroConta, double saldo, Persoa cliente) {
        super(numeroConta, saldo, cliente);
    }

    @Override
    public String toString() {
        return "Cuenta Corriente interese: " + interese+" %";
    }    
    
    
}
