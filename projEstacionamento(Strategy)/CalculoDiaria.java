package pct;

public class CalculoDiaria extends CalculoValor{

    private static long TAXADIARIA = 20;
    
    public CalculoDiaria(long duracao) {        
        super(duracao, TAXADIARIA);        
    }    
}