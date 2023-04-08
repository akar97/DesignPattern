package org.akar97;

import org.akar97.observer.CurrentConditionDisplay;
import org.akar97.subject.WeatherData;

public class ObserverPatternMain {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurement(80, 65 ,30.4f);
    }
}