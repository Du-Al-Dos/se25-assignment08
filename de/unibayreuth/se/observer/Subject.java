package de.unibayreuth.se.observer;

import java.util.List;

public abstract class Subject {
    // TODO
    private Observer subject;
    private List<Observer> observers;
    private int value;

    public Subject() {
        // TODO
        this.observers = new java.util.ArrayList<>();
        this.value = 0;
    }

    void attach(Observer observer) {
        // TODO

        observers.add(observer);
    }

    void detach(Observer observer) {
        // TODO
        if (observer != null && observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    protected void fireUpdate() {

        // TODO
        subject.update(this);
    }

}