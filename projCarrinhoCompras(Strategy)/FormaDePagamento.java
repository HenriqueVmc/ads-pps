package pct;

import java.util.ArrayList;

public class FormaDePagamento implements IFormaDePagamento{
    
    private String formaPagamento = "";

    public void setFormaPagamento(String forma){        
        this.formaPagamento = forma;
    }

    @Override
    public void comprar(double valorTotal) {
        System.out.println("Valor total = "+ valorTotal + " pago com " + this.formaPagamento);
    }

}