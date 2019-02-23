package pct;

public class CalculoValor implements ICalculoValor{

    private long duracao = 0;
    private long taxa = 0;

    public CalculoValor(long duracao, long taxa) {
    
        this.duracao = duracao;
        this.taxa = taxa;
    }
    
    @Override
    public long calcularValorFinal() {
        
        return this.duracao * this.taxa;
    }    
}