
package prova2;


public class TetoSolar extends CarroDecorator {
    
    public TetoSolar(Carro carro) {
        super(carro);        
        this.opcional = "Teto Solar";
        this.valorOpcional = 8000;
    }    
}
