package pct;

import java.util.ArrayList;

public class CartaoDeCredito extends FormaDePagamento {
    
    private String nome;
    private String numero;
    private String codigo;
    private String dataValidade;
    
    public CartaoDeCredito(String nome, String numero, String codigo, String dataValidade){
        
        super.setFormaPagamento("Cartão de Crédito");        
        this.nome = nome;
        this.numero = numero;
        this.codigo = codigo;
        this.dataValidade = dataValidade;
    }    
}