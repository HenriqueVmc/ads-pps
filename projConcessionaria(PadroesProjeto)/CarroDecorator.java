/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;

/**
 *
 * @author aluno
 */
public abstract class CarroDecorator extends Carro {
    Carro carro;    
    String opcional;
    double valorOpcional;

    public CarroDecorator(Carro carro) {
        
        super(carro.getFabrica());
        this.carro = carro;
    }
    
    public void getDescricao() {       
       this.carro.setPreco(valorOpcional);
       this.carro.getDescricao();
       System.out.println("\nOpcional:\n " + opcional);
    }
}
