package prova2;

public class Main {

    public static void main(String[] args) {
        Carro carro;

        carro = new Kicks(new FabricaKicks());
        carro.getDescricao();

        System.out.println("*************************");

        carro = new TetoSolar(carro);
        carro.getDescricao();

        System.out.println("*************************");

        carro = new Fiesta(new FabricaFiesta());
        carro.getDescricao();

        System.out.println("*************************");

        carro = new VidroEletrico(carro);
        carro.getDescricao();

        System.out.println("*************************");

        carro.acelerar();
        carro.ligar();

        for (int i = 0; i < 10; i++) carro.acelerar();
        System.out.println("*************************");

        for (int i = 0; i < 10; i++) carro.frear();
        
        carro.desligar();
        carro.acelerar();

    }

}
