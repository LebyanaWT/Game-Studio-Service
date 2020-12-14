package com.gamestudio.controller;

import com.gamestudio.service.GamestudioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GamestudioController {

    @Autowired
    private GamestudioService serviceObj;

    @ResponseBody
    @GetMapping(value ="/conversions/ktoc/{inputAmountInKelvin}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public double getConvertKelvinToCelsius(@PathVariable(value = "inputAmountInKelvin" , required = true) double inputAmountInKelvin ) {
        return serviceObj.convertKToC(inputAmountInKelvin);
    }

    @ResponseBody
    @GetMapping(value = "conversions/ctok/{inputAmountInCelsius}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public double getConvertedCelsiusToKelvin(@PathVariable(value = "inputAmountInCelsius" ,required = true) double inputAmountInCelsius){
        return serviceObj.convertCelsiusToKelvin(inputAmountInCelsius);
    }


    @ResponseBody
    @GetMapping(value = "conversions/mtok/{inputAmountInMiles}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public double getConvertedMilesToKilometers(@PathVariable(value = "inputAmountInMiles" , required = true) double inputAmountInMiles){
        return serviceObj.convertMilesToKilos(inputAmountInMiles);
    }

    @ResponseBody
    @GetMapping(value = "/conversions/ktom/{inpuntAmountInKilos}" ,produces = MediaType.APPLICATION_JSON_VALUE)
    public double getConvertKilometersToMiles(@PathVariable(value = "inpuntAmountInKilos" ,required = true) double inpuntAmountInKilos) {
        return serviceObj.convertKilosToMiles(inpuntAmountInKilos);
    }
}
