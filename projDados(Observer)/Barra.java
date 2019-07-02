package ex3observer;

public class Barra implements IObserver{

    Dados dados;

    public Barra(Dados dados) {
        this.dados = dados;
        this.dados.registerObserver(this);
    }

    public void show() {

        String barraA = "", barraB = "", barraC = "";

        for (int i = 0; i < dados.getValorA(); i++) {
            barraA += '|';
        }

        for (int i = 0; i < dados.getValorB(); i++) {
            barraB += '|';
        }

        for (int i = 0; i < dados.getValorC(); i++) {
            barraC += '|';
        }

        System.out.println("Barras:\nValor A: " + barraA + "\nValor B: "
                + barraB + "\nValor C: " + barraC);
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
