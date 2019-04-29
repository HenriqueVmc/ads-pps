package ex5adapter;

import java.util.ArrayList;
import java.util.List;

public class MainDepoisClasse {

    public static void main(String[] args) {
        Pato pato = new PatoMarreco();
        Pato peruAdapter = new PeruAdapterClasse();

        List<Pato> patos = new ArrayList<Pato>();
        patos.add(pato);
        patos.add(peruAdapter);

        for (Pato p : patos) {
            p.grasnar();
            System.out.println();
            p.voar();
            System.out.println();
        }
    }
}
