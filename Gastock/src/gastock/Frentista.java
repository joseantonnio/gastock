/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gastock;

/**
 *
 * @author Alex
 */
public class Frentista {

    private String nome;
    private String senha;
    private float salario;
    
    public Frentista(){
        
    }
    
    public Frentista(String nome, String senha, float salario){
        this.nome = nome;
        this.senha = senha;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return this.senha;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalario() {
        return this.salario;
    }

   
    
}
