package model;

public class Kelvin extends Temperature {
    
    public Kelvin() {
        celsiusFormula = "%sK - 273.15 = %s°C";
        farenheitFormula = "(%sK - 273.15) * 1.8 + 32 = %s°F";
        rankineFormula = "%sK * 1.8 = %s°R";
        reaumurFormula = "(%sK - 273.15) * 0.8 = %s°Re";
    }
    
    @Override
    public double convertToC(double temp)
    { return temp - 273.15; }
    
    @Override
    public double convertToF(double temp)
    { return (temp - 273.15) * 1.8 + 32; }
    
    @Override
    public double convertToRa(double temp)
    { return temp * 1.8; }
    
    @Override
    public double convertToRe(double temp)
    { return (temp - 273.15) * 0.8 ; }
    
}
