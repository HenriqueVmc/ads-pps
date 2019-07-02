package ex3observer;

public class Tabela implements IObserver{

    Dados dados;

    public Tabela(Dados dados) {
        this.dados = dados;
        this.dados.registerObserver(this);
    }

    public void show() {
        System.out.println("Tabela:\nValor A: " + dados.getValorA()
                + "\nValor B: " + dados.getValorB() + "\nValor C: "
                + dados.getValorC());
    }

    public Dados getDados() {
        return dados;
    }

    public void setDados(Dados dados) {
        this.dados = dados;
    }

    @Override
    public void update() {
        show();
    }
}
