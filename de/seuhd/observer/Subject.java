package de.seuhd.observer;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    // TODO: Add fields.
    public List<ConcreteObserver> observers = new ArrayList<>();
    public int subjvalue;
    public boolean changed;

    void attach(ConcreteObserver observer) {
        // TODO: Implement attach method.
        observers.add(observer);
        observer.changeID(observers.size());
        notifyObservers();
    }

    void detach(ConcreteObserver observer) {
        // TODO: Implement detach method.
        observers.remove(observer);
    }

    protected void notifyObservers() {
        // TODO: Implement fireUpdate method.
        for(Observer o: observers){

            o.update(this);

        }
    }
}
