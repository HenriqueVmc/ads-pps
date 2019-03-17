package pct;

public class Veiculo{

    public static int PASSEIO = 1;
    private String placa = "";
    
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
            
    public Veiculo(String placa, int tipoVeiculo){
        setPlaca(placa);
        
        if(tipoVeiculo == PASSEIO){
            imprimirConta();
        }            
    }

    public void imprimirConta() {
        
    }
}