/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2state;

/**
 *
 * @author aluno
 */
public class RobotOff implements RoboticState{

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void cook() {
       System.out.println("Cannot cook at Off state.");
    }

    @Override
    public void off() {
        System.out.println("Robot is switched off");
    }
    
}
