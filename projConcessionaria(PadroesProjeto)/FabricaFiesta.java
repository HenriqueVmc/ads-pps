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
public class FabricaFiesta implements IFabricaCarro {

    @Override
    public IMotor construirMotor() {
        return new MotorFiesta();
    }

    @Override
    public IDirecao construirDirecao() {
        return new DirecaoFiesta();
    }

    @Override
    public ISuspensao construirSuspencao() {
        return new SuspensaoFiesta();
    }

    @Override
    public IBateria construirBateria() {
        return new BateriaFiesta();
    }
    
}
