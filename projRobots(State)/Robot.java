package ex2state;

class Robot {
    RoboticState state;

    public Robot() {
        state = new RobotWalk();
    }
    
    void walk() {
        state.walk();
        state = new RobotWalk();
    }

    void cook() {
        state.cook();
        state = new RobotCook();
    }

    void off() {
        state.off();
        state = new RobotOff();
    }
    
}