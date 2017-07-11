package activity;

public class Inspection {
    
    private double lat;
    private double lng;
    private String name;
    private int license;
    private boolean passed;
    private boolean highRisk;
    private int daysSince;
    private String notes;

    public Inspection(double lat, double lng, String name, int license, boolean passed, boolean highRisk, int daysSince, String notes) {
        this.lat = lat;
        this.lng = lng;
        this.name = name;
        this.license = license;
        this.passed = passed;
        this.highRisk = highRisk;
        this.daysSince = daysSince;
        this.notes = notes;
    }
    
    public double getLat() {
        return this.lat;
    }
    
    public double getLng() {
        return this.lng;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getLicense() {
        return this.license;
    }
    
    public boolean passed() {
        return this.passed;
    }
    
    public boolean isHighRisk() {
        return this.highRisk;
    }
    
    public int getDaysSince() {
        return this.daysSince;
    }
    
    public String getNotes() {
        return this.notes;
    }
    
}