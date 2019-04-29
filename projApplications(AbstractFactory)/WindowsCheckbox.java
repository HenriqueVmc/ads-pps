package ex3abstractfactory;

public class WindowsCheckbox implements ICheckbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
