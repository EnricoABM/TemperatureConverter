package controller;

import model.Temperature;
import model.Celsius;
import model.Farenheit;
import model.Kelvin;
import model.Rankine;
import model.Reaumur;

public class ConverterController {
    
    public static String convert(String tempInput, String initialScale, String finalScale) throws NumberFormatException {
        // Creates an object to format floating point values to two decimal places
      
        // Converts the "tempInput" value to be used in the conversion methods below
        double tempDouble = Double.parseDouble(tempInput);
        
        double resultTemp = 0;
        
        Temperature converter = getInitialScale(initialScale);

        if (finalScale.equals("Celsius"))
            resultTemp = converter.convertToC(tempDouble);
        else if (finalScale.equals("Kelvin"))
            resultTemp = converter.convertToK(tempDouble);
        else if (finalScale.equals("Farenheit"))
            resultTemp = converter.convertToF(tempDouble);
        else if (finalScale.equals("Rankine"))
            resultTemp = converter.convertToRa(tempDouble);
        else if (finalScale.equals("Reaumur"))
            resultTemp = converter.convertToRe(tempDouble);
        
        return String.format("%.2f", resultTemp);
    }

    public static String getFormula(String tempInput, String tempOutput, String initialScale, String finalScale) {
        String template = "";
        
        Temperature temp = getInitialScale(initialScale);
        if (finalScale.equals("Celsius"))
            template = temp.getCelsiusFormula();
        else if (finalScale.equals("Kelvin"))
            template = temp.getKelvinFormula();
        else if (finalScale.equals("Farenheit"))
            template = temp.getFarenheirFormula();
        else if (finalScale.equals("Rankine"))
            template = temp.getRankineFormula();
        else if (finalScale.equals("Reaumur"))
            template = temp.getReaumurFormula();
        
        return String.format(template, tempInput, tempOutput);
    }
    
    private static Temperature getInitialScale(String initialScale) {
        Temperature scale = new Temperature();
        if (initialScale.equals("Celsius"))
            scale = new model.Celsius();
        else if (initialScale.equals("Kelvin"))
            scale = new model.Kelvin();
        else if (initialScale.equals("Farenheit"))
            scale = new model.Farenheit();
        else if (initialScale.equals("Rankine"))
            scale = new model.Rankine();
        else if (initialScale.equals("Reaumur"))
            scale = new model.Reaumur();
        return scale;
    }
    
}
