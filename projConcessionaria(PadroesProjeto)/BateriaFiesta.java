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
public class BateriaFiesta implements IBateria{
    String bateria = "Bateria:\n ACDelco";

    @Override
    public void getDescricao() {
        System.out.println(bateria);
    }
    
}
