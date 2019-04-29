package ex5adapter;


public class MainAntes {
    public static void main( String[] args ){
    	
        Pato pato = new PatoMarreco();
        pato.grasnar();
        System.out.println();
        pato.voar();
        System.out.println();
        
        Peru peru = new PeruAustraliano();
        peru.soar();
        System.out.println();
        peru.voar();
        System.out.println();

    }
}
