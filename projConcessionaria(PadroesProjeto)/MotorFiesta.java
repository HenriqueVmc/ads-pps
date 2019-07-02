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
public class MotorFiesta implements IMotor {

    String motor = "Motor:\n"
            + " Dianteiro, transversal, 3 cilindros em linha, 1.0, 12V, comando duplo, turbo, injeção direta de gasolina.\n"
            + " Potência: 125 cv a 6.000 rpm\n"
            + " Torque: 17,3 kgfm a 1.400 rpm";

    @Override
    public void getDescricao() {
        System.out.println(motor);
    }

}
