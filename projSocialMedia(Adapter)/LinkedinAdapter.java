package ex4adapter;

public class LinkedinAdapter implements ISocialNetworks {

    public LinkedinAdapter() {
    }

    @Override
    public void Share(String msg) {
        System.out.println("Linkedin: " + msg);
    }
    
}
