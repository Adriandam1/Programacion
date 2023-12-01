/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletins17;

/**
 *
 * @author Adrian
 */
public class Persoa {
    private String nome;
    private String apelido;
    private String nif;

    public Persoa() {
    }

    public Persoa(String nome, String apelido, String nif) {
        this.nome = nome;
        this.apelido = apelido;
        this.nif = nif;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "\tNome: " + nome + "\tApelido: " + apelido + "\tnif: " + nif;
    }
    
    
    
}
