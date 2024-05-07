package model;

public class Celsius extends Temperature{
    
    public Celsius() {
        farenheitFormula = " %s°C × 1.8 + 32 = %s°F";
        kelvinFormula = "%s°C + 273.15 = %sK";
        rankineFormula = "%s°C × 1.8 + 491.67 = %s°R";
        reaumurFormula = "%s°C × 0.8 = %s°Re";
    }
    
    
    @Override
    public double convertToF(double temp)
    { return temp * 1.8 + 32; }
    
    @Override
    public double convertToK(double temp)
    { return temp + 273.15; }
    
    @Override
    public double convertToRa(double temp)
    { return temp * 1.8 + 491.67; }
    
    @Override
    public double convertToRe(double temp)
    { return temp * 0.8; }    

}
