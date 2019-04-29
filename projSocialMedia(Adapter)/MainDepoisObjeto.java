package ex4adapter;

import java.util.ArrayList;
import java.util.List;

public class MainDepoisObjeto {

    public static void main(String[] args) {
        List<ISocialNetworks> list = new ArrayList<ISocialNetworks>();
        list.add(new FacebookAdapterObjeto(new Facebook()));
        list.add(new LinkedinAdapterObjeto(new Linkedin()));
        list.add(new TwitterAdapterObjeto(new Twitter()));
        list.add(new GooglePlusAdapterObjeto(new GooglePlus()));

        for (ISocialNetworks socialNetworks : list) {
            socialNetworks.Share("Message");

        }
    }
}
