package pct;

public class Item{
    
    private String codigo;
    private double valor;
    
    public Item(String codigo, double valor){
        this.codigo = codigo;
        this.valor = valor;
    }
    
    public double getValor(){
        return this.valor;
    }        
}