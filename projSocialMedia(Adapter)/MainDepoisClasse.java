package ex4adapter;

import java.util.ArrayList;
import java.util.List;

public class MainDepoisClasse {

    public static void main(String[] args) {
        List<ISocialNetworks> list = new ArrayList<ISocialNetworks>();
        list.add(new FacebookAdapter());
        list.add(new LinkedinAdapter());
        list.add(new TwitterAdapter());
        list.add(new GooglePlusAdapter());

        for (ISocialNetworks socialNetworks : list) {
            socialNetworks.Share("Message");

        }
    }
}
