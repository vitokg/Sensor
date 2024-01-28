package org.example;

public abstract class Observer {
    TemperatureSubject temperatureSubject;

    public abstract void update();
}
