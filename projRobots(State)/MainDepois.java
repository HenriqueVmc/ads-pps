package ex2state;

public class MainDepois {

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.walk();
        robot.walk();
        robot.cook();
        robot.off();
        robot.walk();
        robot.off();
        robot.walk();
        robot.off();
        robot.cook();

    }
}
//Walking...
//Walking...
//Cooking...
//Cannot switched off while cooking...
//Walking...
//Robot is switched off
//Walking...
//Robot is switched off
//Cannot cook at Off state.
