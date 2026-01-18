package de.seuhd.observer;

public class ConcreteObserver implements Observer {
    // TODO: Add fields and static variables.

    public int id;
    public Boolean registered;
    public int subjectvalue;
    public Subject subjectedto;

    public ConcreteObserver(Subject subject) {
        // TODO: Implement constructor.
        subject.attach(this);
        registered = true;
        subjectvalue = subject.subjvalue;
        this.subjectedto = subject;
    }

    @Override
    public void update(Subject subject) {
        // TODO: Implement update method.
        if (subject.subjvalue != subjectvalue) {
            subjectvalue = subject.subjvalue;
            System.out.println("Observer " + id + " received update from subject: New value is " + subjectvalue);
        }
        else {
            //System.out.println("Observer " + id + " received update from subject: There is a new Observer");
        }
    }

    public void detach() {
        // TODO: Implement detach method.
        subjectedto.detach(this);
    }
    public void changeID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

}
