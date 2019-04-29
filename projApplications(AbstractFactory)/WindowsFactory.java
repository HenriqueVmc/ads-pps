package ex3abstractfactory;

public class WindowsFactory implements ISystemFactory{

    public WindowsFactory() {
    }

    @Override
    public IButton construirButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox construirCheck() {
        return new WindowsCheckbox();
    }
    
}
