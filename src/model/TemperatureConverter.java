package model;

public class TemperatureConverter {
        
    public static double converter(double initialValue, TemperatureScale initialScale, TemperatureScale finalScale) {
        double finalValue = ((initialValue - initialScale.getMinScale()) / initialScale.deltaScale()) * finalScale.deltaScale() + finalScale.getMinScale();
        return finalValue;
    }
}
