package org.example;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSubject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int temperature;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
