package prova2;

public class Fiesta extends Carro {
    
    public Fiesta(IFabricaCarro carro) {
        // Método que constroi carro:
        super(carro);
        this.nome = "Fiesta";
        this.preco = 69790.00;
    }
}
