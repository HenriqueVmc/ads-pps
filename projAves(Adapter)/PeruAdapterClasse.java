package ex5adapter;

public class PeruAdapterClasse implements Pato {

    public PeruAdapterClasse() {
    }

    @Override
    public void grasnar() {
        new PeruAustraliano().soar();
    }

    @Override
    public void voar() {
        new PeruAustraliano().voar();
    }
    
}
