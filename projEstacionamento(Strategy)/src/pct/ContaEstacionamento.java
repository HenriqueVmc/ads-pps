package pct;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaEstacionamento implements IContaEstacionamento{

    private long valorFinal = 0;
    
    private String dataEntradaFormatada = "";
    private String dataSaidaFormatada = "";
    private Date dataEntrada = new Date();
    private Date dataSaida = new Date();
    
    private long dias = 0;
    private long horas = 0;
    //private long minutos = 0;
    //private long segundos = 0;
    
    private Veiculo veiculo = null;
    
    private CalculoValor calculo;

    public void setValorFinal(long valorFinal) {
        this.valorFinal += valorFinal;
    }

    //--------------------------------------------------------------------------------

    public ContaEstacionamento(Veiculo veiculo, String dataEntrada, String dataSaida) {

        this.dataEntradaFormatada = dataEntrada;
        this.dataSaidaFormatada = dataSaida;
        this.dataEntrada = toDateType(dataEntrada);
        this.dataSaida = toDateType(dataSaida);
        
        calcularDuracao();        
        
        this.veiculo = veiculo;
        
        if(this.dias >= 1){            
            calculo = new CalculoDiaria(this.dias);
            setValorFinal(calculo.calcularValorFinal());
        }        
        if(this.horas >= 1){            
            calculo = new CalculoHoras(this.horas);
            setValorFinal(calculo.calcularValorFinal());
        }
    }

    @Override
    public void imprimirConta() {     

        System.out.println("Placa: " + this.veiculo.getPlaca() + "\n" +
                           "Entrada: " + this.dataEntradaFormatada + "\n" +
                           "Saída: " + this.dataSaidaFormatada + "\n" +
                           "Tempo Estacionado: " + ((this.dias >= 1) ? this.dias * 24 + this.horas : this.horas) + "h \n" +
                           "Valor Pago: R$ " + this.valorFinal + "\n");
    }

    private Date toDateType(String dataEntrada) {

        Date date = null;

        try {
            DateFormat formato = new SimpleDateFormat("dd-mm-yyyy HH:mm:ss");
            date = (Date) formato.parse(dataEntrada);

        } catch (Exception e) {
            e.getMessage();
        }

        return date;
    }

    private void calcularDuracao() {
        
        long duracao = 0;
        duracao = Math.abs(this.dataSaida.getTime() - this.dataEntrada.getTime());       

        //this.segundos = (duracao / 1000) % 60;
        //this.minutos = (duracao / 60000) % 60;     
        this.horas = (duracao / 3600000) % 24;
        this.dias = duracao / 86400000;             
    }
}
