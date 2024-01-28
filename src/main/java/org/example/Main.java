package org.example;

public class Main {
    public static void main(String[] args) {

        TemperatureSubject temperatureSubject = new TemperatureSubject();
        new WeightObserver(temperatureSubject);
        new ColorObserver(temperatureSubject);

        temperatureSubject.setTemperature(10);
        temperatureSubject.setTemperature(2);
        temperatureSubject.setTemperature(-10);
        temperatureSubject.setTemperature(0);

    }
}
