package ex3abstractfactory;

public class MacOSFactory implements ISystemFactory {

    public MacOSFactory() {
    }
    
    @Override
    public IButton construirButton() {
        return new MacOSButton();
    }

    @Override
    public ICheckbox construirCheck() {
        return new MacOSCheckbox();
    }
}
