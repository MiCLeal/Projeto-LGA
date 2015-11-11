package Objetos;

/**
 * Classe Obras para
 * @author MichaelAnthony - Michael Anthony Leal Costa
 * @since Classe criada em 10/11/2015 / 02:27:28
 */
public class Obras extends Servico {

    private int id;
    private String local;
    private String cliente;
    private double valor;
    
    
    public Obras(){
        super();
    }
    
    public int getID(){
        return id;
    }
    
    public void setID(int i){
        this.id = i;
    }
    
    public String getLocal(){
        return local;
    }
    
    public void setLocal(String l){
        this.local = l;
    }
    
    public String getCliente(){
        return cliente;
    }
    
    public void setCliente(String c){
        this.cliente = c;
    }
    
    public double getValor(){
        return valor;
    }
    
    public void setValor(double v){
        this.valor = v;
    }
}