package de.seuhd.observer;

public class ConcreteSubject extends Subject {
    // TODO: implement concrete subject




    public void setValue(int subjectState) {
        this.subjvalue = subjectState;
        System.out.println("Value of subject updated to " + subjectState);
        System.out.println("Sending update to Observers");
        notifyObservers();
    }
}
