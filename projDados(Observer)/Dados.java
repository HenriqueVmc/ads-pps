package ex3observer;

public class Dados extends Subject {

    int valorA, valorB, valorC;

    public Dados(int a, int b, int c) {
        valorA = a;
        valorB = b;
        valorC = c;
    }

    public void setDados(int a, int b, int c) {
        valorA = a;
        valorB = b;
        valorC = c;
        
        notifyObservers();
    }

    public int getValorA() {
        return valorA;
    }

    public int getValorB() {
        return valorB;
    }

    public int getValorC() {
        return valorC;
    }

}
