/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova2;

/**
 *
 * @author aluno
 */
public class SuspensaoFiesta implements ISuspensao {

    String suspensao = "Suspensões:\n Independente Multilink na dianteira e eixo de torção na traseira";

    @Override
    public void getDescricao() {
        System.out.println(suspensao);
    }

}
