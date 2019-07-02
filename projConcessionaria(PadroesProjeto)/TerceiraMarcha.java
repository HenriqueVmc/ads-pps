package prova2;

public class TerceiraMarcha implements IEstadoMarcha {

    Carro carro;
    
    public TerceiraMarcha(Carro carro) {
        this.carro = carro;
    }
    
    @Override
    public void acelerar() {               
        this.carro.velocidade += 10;
        System.out.println("O carro está à " + this.carro.velocidade + " km/h na terceira marcha.");
    }

    @Override
    public void frear() {
        
        this.carro.velocidade -= 10;
        
        if (this.carro.velocidade <= 60) this.carro.estadoMarha = new SegundaMarcha(this.carro);
        
        System.out.println("O carro está à " + this.carro.velocidade + " km/h na terceira marcha.");
    }
}