package ex3abstractfactory;


public interface ISystemFactory {

    IButton construirButton();
    ICheckbox construirCheck();
}