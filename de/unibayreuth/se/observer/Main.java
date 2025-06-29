package de.unibayreuth.se.observer;

public class Main {
    public static void main(String[] args) {
        // TODO: Uncomment after resolving all TODOs. No changes are required in the
        // main method.
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver(subject, "Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver(subject, "Observer 2");
        subject.setValue(5);
        observer1.detach();
        subject.setValue(1);
        observer2.detach();
        subject.setValue(3);
    }
}
