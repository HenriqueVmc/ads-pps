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
public class FabricaKicks implements IFabricaCarro{

    @Override
    public IMotor construirMotor() {
        return new MotorKicks();
    }

    @Override
    public IDirecao construirDirecao() {
        return new DirecaoKicks();
    }

    @Override
    public ISuspensao construirSuspencao() {
        return new SuspensaoKicks();
    }

    @Override
    public IBateria construirBateria() {
        return new BateriaKicks();
    }
    
}
