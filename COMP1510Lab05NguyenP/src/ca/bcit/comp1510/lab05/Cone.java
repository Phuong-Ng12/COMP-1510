package ca.bcit.comp1510.lab05;

/**
 * Cone.
 * @author Phuong
 * @version 1.0
 */
public class Cone {
    /**
     * Private final variable represents PI value.
     */
    private static final double PI = Math.PI;
    
    /**
     * Private final variable represents value 
     * one third for further calculations.
     */
    private final double onethird = 1 / 3;
    
    /**
     * Private instance variable represents radius of the cone.
     */
    private double r;
    
    /**
     * Private instance variable represents the height of the cone.
     */
    private double h;
    
    /**
     * Private instance variable represents the volume of the cone.
     */
    private double v;
    
    /**
     * Private instance variable represents the slant height of the cone.
     */
    private double sh;
    
    /**
     * Private instance variable represents the surface area of the cone.
     */
    private double a;
    
    /** Public constructor which accepts parameters for
     * radius and height.
     * @param radius double value
     * @param height double value
     */
    public Cone(double radius, double height) {
        this.r = radius;
        this.h = height;
    }
    
    /**
     * An accessor for radius variable.
     * @return return r as double
     */
    public double getRadius() {
        return r;
    }
    
    /**
     * A mutator for radius variable.
     * @param radius double
     */
    public void setRadius(double radius) {
        r = radius;
    }
    
    /**
     * An accessor for height variable.
     * @return return h as double
     */
    public double getHeight() {
        return h;
    }
    
    /**
     * A mutator for height variable.
     * @param height double
     */
    public void setHeight(double height) {
        h = height;
    }
    
    /**
     * Return double value of the cone's volume.
     * @return return v volume of the cone
     */
    public double volume() {
        v = onethird * PI * r * r * h;
        return v;
    }
    
    /**
     * Return double value of the cone's slant height.
     * @return return sh slant height of the cone
     */
    public double slantHeight() {
        sh = Math.sqrt((r * r) + (h * h));
        return sh;
    }
    
    /**
     * Return double value of the cone's surfaceArea.
     * @return return A surface area of the cone
     */
    public double surfaceArea() {
        a = PI * r * r + PI * r 
                * (Math.sqrt((r * r) + (h * h)));
        return a;
    }
    
    /**
     * Return a String representation of the cone's information.
     * @return return a concatenation of the cone's information
     */
    public String toString() {
        return "Cone" + "\t" + "Radius: " + r + "\t" + "Height: " + h 
                + "\t" + "Volume: " + v + "\t" + "Slant height: " + sh 
                + "\t" + "Surface area: " + a;
    }

}
