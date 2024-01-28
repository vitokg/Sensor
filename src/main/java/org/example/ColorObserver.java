package org.example;

public class ColorObserver extends Observer {

    public ColorObserver(TemperatureSubject temperatureSubject) {
        this.temperatureSubject = temperatureSubject;
        this.temperatureSubject.attach(this);
    }
    @Override
    public void update() {
        int temperature = temperatureSubject.getTemperature();
        if (temperature <= 0) {
            System.out.println("Color: White");
        } else {
            System.out.println("Color: Black");
        }
    }
}
