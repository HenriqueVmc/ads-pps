package ex5adapter;


public class PatoMarreco implements Pato {
    @Override
    public void grasnar() {
        System.out.print("Quack, quack, quack.");
    }

    @Override
    public void voar() {
        System.out.print("Voar, voar, voar, voar, voar");
    }
}
