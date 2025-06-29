package de.unibayreuth.se.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject extends Subject {
    private List<Observer> observers = new ArrayList<>();
    private int value;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
        this.value = 0;
    }

    public void setValue(int value) {
        this.value = value;
        fireUpdate();
    }

    public int getValue() {
        return value;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void fireUpdate() {
        System.out.println("Sending update to observers ...");
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
