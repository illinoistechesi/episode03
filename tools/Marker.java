package tools;
import java.awt.Color;

public class Marker {
    
    private double lat;
    private double lng;
    private Color color;
    private double size;
    private double opacity;
    private String text;
    
    public Marker() {
        this.lat = 0.0;
        this.lng = 0.0;
        this.color = Color.BLACK;
        this.size = 1;
        this.opacity = 1.0;
        this.text = "";
    }
    
    public Marker(double lat, double lng, Color color, double size, double opac, String text) {
        this.lat = lat;
        this.lng = lng;
        this.color = color;
        this.size = size;
        this.opacity = opac;
        this.text = text;
    }
    
    public Marker(double lat, double lng) {
        this.lat = lat;
        this.lng = lng;
        this.color = Color.BLACK;
        this.size = 1;
        this.opacity = 1.0;
        this.text = "";
    }
    
    public Marker(double lat, double lng, String text) {
        this.lat = lat;
        this.lng = lng;
        this.color = Color.BLACK;
        this.size = 1;
        this.opacity = 1.0;
        this.text = text;
    }
    
    public Marker(double lat, double lng, String text, Color color) {
        this.lat = lat;
        this.lng = lng;
        this.color = color;
        this.size = 1;
        this.opacity = 1.0;
        this.text = text;
    }
    
    public Marker(double lat, double lng, String text, Color color, double size) {
        this.lat = lat;
        this.lng = lng;
        this.color = color;
        this.size = size;
        this.opacity = 1.0;
        this.text = text;
    }
    
    public double getLat() {
        return this.lat;
    }
    
    public void setLat(double lat) {
        this.lat = lat;
    }
    
    public double getLng() {
        return this.lng;
    }
    
    public void setLng(double lng) {
        this.lng = lng;
    }
    
    public Color getColor() {
        return this.color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }
    
    public double getSize() {
        return this.size;
    }
    
    public void setSize(double size) {
        this.size = size;
    }
    
    public double getOpacity() {
        return this.opacity;
    }
    
    public void setOpacity(double opacity) {
        this.opacity = opacity;
    }
    
    public String getText() {
        return this.text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public String toData() {
        double lat = this.getLat();
        double lng = this.getLng();
        Color color = this.getColor();
        double size = this.getSize();
        double opac = this.getOpacity();
        String text = this.getText();
        String r = color.getRed() + "";
        String g = color.getGreen() + "";
        String b = color.getBlue() + "";
        String colorStr = "rgb(" + String.join(", ", r, g, b) + ")";
        String out = String.format("%s$@$%s$@$%s$@$%s$@$%s$@$%s$@@$", lat, lng, colorStr, size, opac, text);
        return out;
    }
    
}