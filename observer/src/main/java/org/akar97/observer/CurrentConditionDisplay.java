package org.akar97.observer;

import org.akar97.subject.WeatherData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CurrentConditionDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private final WeatherData weatherData;
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        logger.info("현재 상태: 온도 {}F, 습도: {}%", temperature, humidity);
    }
}
