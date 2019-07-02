package prova2;

public class SegundaMarcha implements IEstadoMarcha {

    Carro carro;

    public SegundaMarcha(Carro carro) {
        this.carro = carro;
    }

    @Override
    public void acelerar() {

        this.carro.velocidade += 10;

        if (this.carro.velocidade >= 60) this.carro.estadoMarha = new TerceiraMarcha(this.carro);
       
        System.out.println("O carro está à " + this.carro.velocidade + " km/h na segunda marcha.");
    }

    @Override
    public void frear() {
        
        this.carro.velocidade -= 10;
        
        if (this.carro.velocidade <= 30) this.carro.estadoMarha = new PrimeiraMarcha(this.carro);
        
        System.out.println("O carro está à " + this.carro.velocidade + " km/h na segunda marcha.");
    }
}
