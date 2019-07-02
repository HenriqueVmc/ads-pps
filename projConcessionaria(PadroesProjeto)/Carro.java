package prova2;

public abstract class Carro {
    
    IFabricaCarro fabrica;
    IEstadoMarcha estadoMarha;
    
    IMotor motor;
    ISuspensao suspensao;
    IDirecao direcao;
    IBateria bateria;

    public String nome;
    public double preco;
    public int velocidade;

    public Carro(IFabricaCarro fabrica) {// Recebe fabrica de carro
        
        this.fabrica = fabrica;
        this.motor = fabrica.construirMotor();
        this.estadoMarha = new Desligado(this);
        
        this.suspensao = fabrica.construirSuspencao();
        this.direcao = fabrica.construirDirecao();
        this.bateria = fabrica.construirBateria();        
        this.velocidade = 0;                
    }

    public void acelerar() {
        estadoMarha.acelerar();
    }

    public void ligar() {
        estadoMarha = new PrimeiraMarcha(this);
    }

    public void desligar() {
        estadoMarha = new Desligado(this);
    }

    public void getDescricao() {
        System.out.println("Nome:\n " + nome);
        System.out.println("Preço:\n " + preco);

        motor.getDescricao();
        suspensao.getDescricao();
        direcao.getDescricao();
        bateria.getDescricao();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco += preco;
    }

    public void frear() {      
        estadoMarha.frear();
    }
    
    public IFabricaCarro getFabrica() {
        return this.fabrica;
    }
}
