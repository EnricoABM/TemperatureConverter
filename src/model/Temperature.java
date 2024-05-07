package model;

public class Temperature {
    protected String celsiusFormula = "%s°C = %s°C";
    protected String farenheitFormula = "%s°F = %s°F";
    protected String kelvinFormula = "%sK = %sK";
    protected String rankineFormula = "%s°R = %s°R";
    protected String reaumurFormula = "%s°Re = %s°Re";
    
    public double convertToC(double temp)
    { return temp; }
    
    public double convertToF(double temp)
    { return temp; }
    
    public double convertToK(double temp)
    { return temp; }
   
    public double convertToRa(double temp)
    { return temp; }
    
    public double convertToRe(double temp)
    { return temp; }
    
    public String getCelsiusFormula() {
        return celsiusFormula;
    }
    
    public String getFarenheirFormula() {
        return farenheitFormula;
    }
    
    public String getKelvinFormula() {
        return kelvinFormula;
    }
    
    public String getRankineFormula() {
        return rankineFormula;
    }
    
    public String getReaumurFormula() {
        return reaumurFormula;
    }
}
