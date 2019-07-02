package ex3singleton;

public class Main {

    public static void main(String[] args) {
        Sistema sistema1 = Sistema.getInstancia();
        sistema1.setUsuarioAutenticado("José");
        System.out.println(sistema1.getUsuarioAutenticado());

        Sistema sistema2 = Sistema.getInstancia();
        sistema2.setUsuarioAutenticado("João");
        System.out.println(sistema2.getUsuarioAutenticado());

        if (sistema1 == sistema2) {
            System.out.println("Objetos iguais!");
        } else {
            System.out.println("Objetos diferentes!");
        }
    }
}
