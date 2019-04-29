package ex3abstractfactory;

public class Application {

    private IButton button;
    private ICheckbox checkbox;

    public Application(ISystemFactory iSystem) {
        setButton(iSystem.construirButton());
        setCheckbox(iSystem.construirCheck());
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

    public void setButton(IButton button) {
        this.button = button;
    }

    public void setCheckbox(ICheckbox checkbox) {
        this.checkbox = checkbox;
    }

}
