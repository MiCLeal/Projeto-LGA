/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objetos;

/**
 * Classe Funcionarios para instanciar objeto funcionarios que iram ser 
 * cadastrados no sistema
 * @author MichaelAnthony - Michael Anthony Leal Costa
 * @since Classe criada em 09/11/2015 / 18:36:06
 */
public class Funcionarios {
    
    // Declaração de variáveis
    private int id;
    private String nome;
    private String funcao;
    private int idade;
    private int nascimento;
    private int rg;
    private int cpf;
    private double salario;
    
    public Funcionarios(){
        
    }// Fim do método construtor
    
    // Método para entregar ID
    public int getID(){
        return id;
    }
    
    // Método para receber ID
    public void setID(int id){
        this.id = id;
    }
    
    // Método para entregar nome
    public String getNome(){
        return nome;
    }
    
    // Método para receber nome
    public void setNome(String n){
        this.nome = n;
    }
    
    // Método para entregar função
    public String getFuncao(){
        return funcao;
    }
    
    // Método para receber função
    public void setFuncao(String f){
        this.funcao = f;
    }
    
    // Método para entregar idade
    public int getIdade(){
        return idade;
    }
    
    // Método para receber idade
    public void setIdade(int i){
        this.idade = i;
    }
    
    // Método para entregar RG
    public int getRG(){
        return rg;
    }
    
    // Método para receber RG
    public void setRG(int rg){
        this.rg = rg;
    }
    
    // Método para entregar nascimento
    public int getNascimento(){
        return nascimento;
    }
    
    // Método para receber Nascimento
    public void setNascimento(int n){
        this.nascimento = n;
    }
    
    // Método para entregar CPF
    public int getCPF(){
        return cpf;
    }
    
    // Método para receber CPF
    public void setCPF(int c){
        this.cpf = c;
    }
    
    // Método para entregar Salário
    public double getSalario(){
        return salario;
    }
    
    // Método para receber Salário
    public void setSalario(double s){
        this.salario = s;
    }
    
}// Fim da Classe