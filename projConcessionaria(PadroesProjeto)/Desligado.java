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
public class Desligado implements IEstadoMarcha {

    Carro carro;
    
    public Desligado(Carro carro) {
        this.carro = carro;
        this.carro.velocidade = 0;
    }
    
    @Override
    public void acelerar() {                
        System.out.println("Carro desligado.");
    }

    @Override
    public void frear() {
        System.out.println("Carro desligado.");
    }

}
