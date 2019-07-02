package ex3observer;

public class Porcentagem implements IObserver{

    Dados dados;

    public Porcentagem(Dados dados) {
        this.dados = dados;
        this.dados.registerObserver(this);
    }

    public void show() {
        double somaDosValores = dados.getValorA() + dados.getValorB() + dados.getValorC();

        double pA = dados.getValorA() / somaDosValores;
        double pB = dados.getValorB() / somaDosValores;
        double pC = dados.getValorC() / somaDosValores;

        System.out.printf("Porcentagem:\nValor A: %.2f \nValor B: %.2f\nValor C: %.2f\n", pA, pB, pC);

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
