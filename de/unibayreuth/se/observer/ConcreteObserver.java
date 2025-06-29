package de.unibayreuth.se.observer;

public class ConcreteObserver implements Observer {
    private final String name;
    private Subject subject;

    public ConcreteObserver(Subject subject, String name) {
        // TODO
        this.subject = subject;
        this.name = name;

        subject.attach(this);
    }

    @Override
    public void update(Subject subject) {
        // TODO
        if (subject instanceof ConcreteSubject concreteSubject) {
            System.out.println(name + " received update from subject ConcreteSubject : " + concreteSubject.getValue());
        }
    }

    public void detach() {

        // TODO
        if (subject == null) {
            System.out.println("No subject to detach from.");
            return;
        }
        subject.detach(this);
    }
}
