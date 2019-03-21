package ex2factorymethod;

public class FormaFactory extends Factory{

    public FormaFactory() {

    }

    @Override
    Forma getForma(String forma) {
        Forma retorno = null;

        if (forma.equals("CIRCULO")) {
            retorno = new Circulo();
        } else if (forma.equals("RETANGULO")) {
            retorno = new Retangulo();
        } else if (forma.equals("QUADRADO")) {
            retorno = new Quadrado();
        } else if (forma.equals("TRAPEZIO")) {
            retorno = new Trapezio();
        }

        return retorno;
    }

}
