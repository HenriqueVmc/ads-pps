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
public class RobotCook implements RoboticState{

    @Override
    public void walk() {
        System.out.println("Cooking...");
    }

    @Override
    public void cook() {
        System.out.println("Cooking...");
    }

    @Override
    public void off() {
        System.out.println("Cannot switched off while cooking...");
    }
    
}
