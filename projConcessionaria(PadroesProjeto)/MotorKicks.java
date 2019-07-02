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
public class MotorKicks implements IMotor{

    String motor = "Motor:\n"
            + " Dianteiro, transversal, 4 cilindros em linha, 16V, comando duplo, flex\n"
            + " Cilindrada: 1.598 cm³\n"
            + " Potência: 114  cv a 5.600 rpm\n"
            + " Torque: 15,5 kgfm a 4.000 rpm";

    @Override
    public void getDescricao() {
        System.out.println(motor);
    }
    
}
