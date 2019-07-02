package ex3observer;

public class MainDepois {

    public static void main(String[] args) {

        Dados dados = new Dados(7, 3, 1);

        Tabela tabela = new Tabela(dados);
        Barra barra = new Barra(dados);
        Porcentagem porcentagem = new Porcentagem(dados);

        dados.setDados(2, 3, 1);

    }
}

//Tabela:
//Valor A: 2
//Valor B: 3
//Valor C: 1
//Barras:
//Valor A: ||
//Valor B: |||
//Valor C: |
//Porcentagem:
//Valor A: 0.33 
//Valor B: 0.50
//Valor C: 0.17
