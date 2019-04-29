package ex4adapter;

public class TwitterAdapter implements ISocialNetworks {

    public TwitterAdapter() {
    }

    @Override
    public void Share(String msg) {
        System.out.println("Twitter: "+ msg);
    }
    
}
