package org.example;

public class WeightObserver extends Observer {
        double weight;

        public WeightObserver(TemperatureSubject temperatureSubject) {
            this.temperatureSubject = temperatureSubject;
            this.temperatureSubject.attach(this);
        }
        @Override
        public void update() {
            int temperature = temperatureSubject.getTemperature();
            if (temperature <= 0) {
                weight = 1;
            } else {
                weight = temperature * 2;
            }

            System.out.println("Weight: " + weight);
        }
}
