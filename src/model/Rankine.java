package model;

public class Rankine extends Temperature{

    public Rankine() {
        celsiusFormula = "(%s°R - 491.67) / 1.8 = %s°C";
        farenheitFormula = "%s°R - 459.67 = %s°F";
        kelvinFormula = "%s°R / 1.8 = %sK";
        reaumurFormula = "(%s°R - 491.67) / 2.25 = %s°Re";
    }
    
    @Override
    public double convertToC(double temp)
    { return (temp - 491.67) / 1.8; }
    
    @Override
    public double convertToF(double temp)
    { return temp - 459.67; }

    @Override
    public double convertToK(double temp)
    { return temp / 1.8; }

    @Override
    public double convertToRe(double temp)
    { return (temp - 491.67) / 2.25; }
    
}
