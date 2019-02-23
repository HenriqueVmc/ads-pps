package pct;

import java.util.ArrayList;

public class CarrinhoDeCompras{
    
    double valorTotal = 0;
    
    ArrayList<Item> itensCarrinho;
    
    public CarrinhoDeCompras(){  
        itensCarrinho = new ArrayList<Item>();
    }
    
    public void addItem(Item item){
        this.itensCarrinho.add(item);
    }
    
    public void comprar(FormaDePagamento formaPagamento){
        
        itensCarrinho.forEach((item) -> valorTotal += item.getValor());
        formaPagamento.comprar(valorTotal);
    }
}