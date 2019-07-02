package prova2;

public class PrimeiraMarcha implements IEstadoMarcha {

    Carro carro;

    public PrimeiraMarcha(Carro carro) {
        this.carro = carro;
    }        
    
    @Override
    public void frear() {
        this.carro.velocidade -= 10;
        System.out.println("O carro está à " + this.carro.velocidade + " km/h na primeira marcha.");
    }

    @Override
    public void acelerar() {                
        
        System.out.println("O carro está à " + this.carro.velocidade + " km/h na primeira marcha.");
        
        this.carro.velocidade += 10;
        
        if(this.carro.velocidade >= 30) this.carro.estadoMarha = new SegundaMarcha(this.carro);                    
        
        
    }

}