package ex3observer;

import ex3observer.IObserver;
import java.util.ArrayList;

public abstract class Subject {
        ArrayList<IObserver> observers = new ArrayList<IObserver>();

    public void registerObserver(IObserver o) {
        observers.add(o);
    }

    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update();
        }
    }
}
