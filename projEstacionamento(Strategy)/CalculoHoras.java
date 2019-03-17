package pct;

public class CalculoHoras extends CalculoValor{
       
    private static long TAXAPORHORA = 2;
    
    public CalculoHoras(long duracao) {        
        super(duracao, TAXAPORHORA);
    }    
}