package model;

public class Reaumur extends Temperature{
    
    public Reaumur() {
        celsiusFormula = "%s°Re / 0.8 = %s°C";
        farenheitFormula = "(%s°Re * 2.25) + 32 = %s°F";
        kelvinFormula = "(%s°Re / 0.8) + 273.15 = %sK";
        rankineFormula = "(%s°Re * 2.25) + 491.67 = %s°R";
    }
    
    @Override
    public double convertToC(double temp)
    { return temp / 0.8; }
    
    @Override
    public double convertToF(double temp)
    { return (temp * 2.25) + 32; }
    
    @Override
    public double convertToK(double temp)
    { return (temp / 0.8) + 273.15; }
   
    @Override
    public double convertToRa(double temp)
    { return (temp * 2.25) + 491.67; }
    
}
