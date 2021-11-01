package ca.bcit.comp1510.lab05;

/**
 * Sphere.
 * @author Phuong
 * @version 1.0
 * 
 */
public class Sphere {
    /**
     * Private final variable represents PI value.
     */
    private static final double PI = 3.14;
    
    /**
     * Private final variable represents three value for 
     * further calculations.
     */
    private final int three = 3;
    
    /**
     * Private final variable represents three value for 
     * further calculations.
     */
    private final int four = 4;
    
    /**
     * Private instance variable represents X-coordinate.
     */
    private double x;
    
    /**
     * Private instance variable represents Y-coordinate.
     */
    private double y;
    
    /**
     * Private instance variable represents Z-coordinate.
     */
    private double z;
    
    /**
     * Private instance variable represents Radius.
     */
    private double r;
    
    /**
     * Private instance variable represents surface area of the sphere.
     */
    private double a;
    
    /**
     * Private instance variable represents volume of the sphere.
     */
    private double v;
    
    /**
     * Public constructor that accepts parameters for X-Coordinate,
     * Y-Coordinate, Z-Coordinate, radius of the sphere.
     * @param radius double value
     * @param xCoor double value
     * @param yCoor double value
     * @param zCoor double value
     */
    public Sphere(double radius, double xCoor, double yCoor, double zCoor) {
        this.x = xCoor;
        this.y = yCoor;
        this.z = zCoor;
        this.r = radius;
    }
    
    /**
     * An accessor for X-Coordinate variable.
     * @return x as a double
     */
    public double getXCoor() {
        return x;
    }
    
    /**
     * A mutator for X-Coordinate variable.
     * @param xCoor double
     */
    public void setXCoor(double xCoor) {
        x = xCoor;
    }
    
    /**
     * An accessor for Y-Coordinate variable.
     * @return y as a double
     */
    public double getYCoor() {
        return y;
    }
    
    /**
     * A mutator for Y-Coordinate variable.
     * @param yCoor double
     */
    public void setYCoor(double yCoor) {
        y = yCoor;
    }
    
    /**
     * An accessor for Z-Coordinate variable.
     * @return z as a double
     */
    public double getZCoor() {
        return z;
    }
    
    /**
     * A mutator for Z-Coordinate variable.
     * @param zCoor double
     */
    public void setZCoor(double zCoor) {
        z = zCoor;
    }
    
    /**
     * An accessor for radius variable.
     * @return r as a double
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
     * Return double value of the sphere's surface area.
     * @return return A surface area of the sphere 
     */
    public double surfaceArea() {
        a = four * PI * r * r;
        return a;
    }
    
    /**
     * Return double value of the sphere's volume.
     * @return return v volume of the sphere
     */
    public double volume() {
        v = (four / three) * PI * r * r * r;
        return v;
    }
    
    /**
     * Return a String representation of the sphere's information.
     * @return return a concatenation of the sphere's information
     */
    public String toString() {
        return "Sphere: " + "\t" + "X-coordinate: " + x + "\t"
                + "Y-coordinate: " + y + "\t" + "Z-coordinate: " 
                + "\t" + z + "\t" + "Radius: " + r + "\t" 
                + "Surface Area: " + a + "\t" + "Volume: " + v;
    }
    


}
