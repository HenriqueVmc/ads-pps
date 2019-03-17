package pct;

import java.util.ArrayList;

public class Paypal extends FormaDePagamento {
    
    private String usuario;
    private String senha;
    
    public Paypal(String usuario, String senha){
        super.setFormaPagamento("Paypal");   
        this.usuario = usuario;
        this.senha = senha;
    }   
}
