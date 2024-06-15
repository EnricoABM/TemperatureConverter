package model;

public enum TemperatureScale {
    CELSIUS (0, 100),
    FARENHEIT (32, 212),
    KELVIN (273, 373),
    RANKINE (491.67 , 671.67),
    REAUMUR (0, 80);
    
    private double minScale;
    private double maxScale;
    
    private TemperatureScale(double minScale, double maxScale) {
        this.minScale = minScale;
        this.maxScale = maxScale;
    }
    
    public double getMinScale() {
        return minScale;
    }
    
    public double getMaxScale() {
        return maxScale;
    }
    
    public void setMinScale(double minScale) {
        this.minScale = minScale;
    }
    
    public void setMaxScale(double maxScale) {
        this.maxScale = maxScale;
    }
    
    public double deltaScale() {
        return maxScale - minScale;
    } 
    
}