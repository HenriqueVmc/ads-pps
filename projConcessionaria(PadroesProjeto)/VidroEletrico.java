
package prova2;


public class VidroEletrico extends CarroDecorator{
    
    public VidroEletrico(Carro carro) {        
        super(carro);
        this.opcional = "Vidro Elétrico";
        this.valorOpcional = 5000;
    }
    
}
