/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objetos;

import java.sql.Time;
import java.util.Date;

/**
 * Classe Servico para
 * @author MichaelAnthony - Michael Anthony Leal Costa
 * @since Classe criada em 10/11/2015 / 02:24:11
 */
public class Servico {

    private int id;
    private int codigo;
    private String nome;
    private Date data;
    private float valor;
    
    public Servico(){
        
    }
    
    public int getID(){
        return id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int c){
        this.codigo = c;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public Date getData(){
        return data;
    }
    
    public void setData(Date d){
        this.data = d;
    }
}