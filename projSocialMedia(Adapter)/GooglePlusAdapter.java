package ex4adapter;

public class GooglePlusAdapter implements ISocialNetworks {

    public GooglePlusAdapter() {
    }

    @Override
    public void Share(String msg) {
        System.out.println("GooglePlus: " + msg);
    }
    
}
