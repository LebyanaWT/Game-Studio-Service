package com.gamestudio.service;

import org.springframework.stereotype.Component;

@Component
public class GamestudioService  {

    private final double MILES_TO_KILOMETERS_CONVERSION_CONSTANT = 1.6 ;
    private final double KILOMETERS_TO_MILES_CONVERSION_CONSTANT = 0.0621;
    private final double CELSIUS_CONVERSION_VALUE = 273.15;

    public double convertKToC(Double amountInKelvin) {
        return amountInKelvin - CELSIUS_CONVERSION_VALUE;
    }

    public double convertCelsiusToKelvin(Double inputAmountInCelsius) {
        return inputAmountInCelsius + CELSIUS_CONVERSION_VALUE;
    }

    public double convertMilesToKilos(double inputAmountInMiles) {
        return inputAmountInMiles * MILES_TO_KILOMETERS_CONVERSION_CONSTANT;
    }

    public double convertKilosToMiles(double inpuntAmountInKilos) {
        return inpuntAmountInKilos * KILOMETERS_TO_MILES_CONVERSION_CONSTANT;
    }
}
