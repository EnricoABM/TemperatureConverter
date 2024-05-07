package model;

public class Farenheit extends Temperature{
    
    
    public Farenheit() {
        celsiusFormula = " (%s°F - 32) / 1.8 = %s°C";
        kelvinFormula = "(%s°F - 32) / 1.8 + 273.15 = %sK";
        rankineFormula = "%s°F + 459.67 = %s°R";
        reaumurFormula = "(%s°F - 32) / 2.25 = %s°Re";
    }
    @Override
    public double convertToC(double temp)
    { return (temp - 32) / 1.8; }

    @Override
    public double convertToK(double temp)
    { return ((temp - 32) / 1.8) + 273.15; }
    
    @Override
    public double convertToRa(double temp)
    { return temp + 459.67; }
    
    @Override
    public double convertToRe(double temp)
    { return (temp - 32) / 2.25; }   
    
}
