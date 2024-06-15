package controller;

import java.util.ArrayList;
import java.util.List;
import model.TemperatureScale;
import model.TemperatureConverter;

public class TemperatureController {
    
    public static String convert(String tempInput, String inputScale, String outputScale) throws NumberFormatException, IllegalArgumentException {
        double doubleTemp = Double.parseDouble(tempInput);
                
        TemperatureScale initialScale = getScale(inputScale);
        TemperatureScale finalScale = getScale(outputScale);
        
        double resultTemp = TemperatureConverter.converter(doubleTemp, initialScale, finalScale);
        return String.format("%.2f", resultTemp);
    }
    
    private static TemperatureScale getScale(String inputScale) throws IllegalArgumentException {
        TemperatureScale outputScala = null;
        if (inputScale.equals("Celsius"))
            outputScala = TemperatureScale.CELSIUS;
        else if (inputScale.equals("Farenheit"))
            outputScala = TemperatureScale.FARENHEIT;
        else if (inputScale.equals("Kelvin"))
            outputScala = TemperatureScale.KELVIN;
        else if (inputScale.equals("Rankine"))
            outputScala = TemperatureScale.RANKINE;
        else if (inputScale.equals("Reaumur"))
            outputScala = TemperatureScale.REAUMUR;
        else 
            throw new IllegalArgumentException("Invalid Scale");
        return outputScala;
    }

    public static List<String> consultAllTemperatures() {
        TemperatureScale[] ltemp = TemperatureScale.values();
        List<String> temps = new ArrayList<>();
        for (TemperatureScale temp : ltemp) {
            String stringTemp = temp.toString();
            String firstLetter = stringTemp.substring(0, 1);
            String remainingLetters = stringTemp.substring(1);
            String formatedTemp = firstLetter + remainingLetters.toLowerCase();
            
            temps.add(formatedTemp);
        }
        return temps;
        
    }
}
