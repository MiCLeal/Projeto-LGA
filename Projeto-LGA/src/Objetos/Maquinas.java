package Objetos;

/**
 * Classe Maquinas para
 * @author MichaelAnthony - Michael Anthony Leal Costa
 * @since Classe criada em 10/11/2015 / 02:13:21
 */
public class Maquinas {

    private int id;
    private String nome;
    private String modelo;
    private String marca;
    private int codigo;
    private int ano;
    
    public Maquinas(){
        
    }
    
    public int getID(){
        return id;
    }
    
    public void setID(int i){
        this.id = i;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String m){
        this.marca = m;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int c){
        this.codigo = c;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int a){
        this.ano = a;
    }
}
