package ex4adapter;

public class FacebookAdapter implements ISocialNetworks {

    public FacebookAdapter() {
    }

    @Override
    public void Share(String msg) {
        System.out.println("Facebook: " + msg);
    }
    
}
