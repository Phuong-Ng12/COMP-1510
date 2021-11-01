package ca.bcit.comp1510.lab05;

/**
 * Cube.
 * @author Phuong
 * @version 1.0
 */
public class Cube {
    /**
     * Private final variable represents value six for further calculations.
     */
    private final int three = 3;
    
    /**
     * Private final variable represents value six for further calculations.
     */
    private final int six = 6;
    
    /**
     * Private instance variable represents X-coordinate of the cube.
     */
    private double x;
    
    /**
     * Private instance variable represents Y-coordinate of the cube.
     */
    private double y;
    
    /**
     * Private instance variable represents Z-coordinate of the cube.
     */
    private double z;
    
    /**
     * Private instance variable represents edge length of the cube.
     */
    private double e;
    
    /**
     * Private instance variable represents surface area of the cube.
     */
    private double a;
    
    /**
     * Private instance variable represents volume of the cube.
     */
    private double v;
    
    /**
     * Private instance variable represents face diagonal of the cube.
     */
    private double f;
    
    /**
     * Private instance variable represents space diagonal of the cube.
     */
    private double s;
    
    /**
     * Public constructor which accepts parameters for X-Coordinate,
     * Y-Coordinate, Z-Coordinate, edge length of the cube.
     * @param xCoor double value
     * @param yCoor double value
     * @param zCoor double value
     * @param edgeLen double value
     */
    public Cube(double xCoor, double yCoor, double zCoor, double edgeLen) {
        this.x = xCoor;
        this.y = yCoor;
        this.z = zCoor;
        this.e = edgeLen;
    }
    
    /**
     * An accessor for X-Coordinate. 
     * @return x as a double value
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
     * @return y as a double value
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
     * An accessor for Z-Coordinator variable.
     * @return z as a double value
     */
    public double getZCoor() {
        return z;
    }
    
    /**
     * A mutator for Z-Coordinator variable.
     * @param zCoor double
     */
    public void setZCoor(double zCoor) {
        z = zCoor;
    }
    
    /**
     * An accessor for edge length variable.
     * @return e as a double value
     */
    public double getEdgeLen() {
        return e;
    }
    
    /**
     * A mutator for edge length variable.
     * @param edgeLen double
     */
    public void setEdgeLen(double edgeLen) {
        e = edgeLen;
    }
    
    /**
     * Return a String representation of the cube's information.
     * @return return a concatenation of the cone's information
     */
    public String toString() {
        return "Cube: " + "\t" + "X-coordinate: " + x + "\t"
                + "Y-Coordinate: " + y + "\t" + "Z-Coordinate: "
                + z + "\t" + "Edge length: " + "\t" + e;
    }
    
    /**
     * Return double value of the cube's surfaceArea.
     * @return return a surface area of the cube
     */
    public double surfaceArea() {
        a = six * e * e;
        return a;
    }
    
    /**
     * Return double value of the cube's surfaceArea.
     * @return return v volume of the cube
     */
    public double volume() {
        v = e * e * e;
        return v;
    }
    
    /**
     * Return double value of the cube's face diagonal.
     * @return return f face diagonal of the cube
     */
    public double faceDiag() {
        f = Math.sqrt(2) * e;
        return f;
    }
    
    /**
     * Return double value of the cube's space diagonal.
     * @return return s space diagonal of the cube
     */
    public double spaceDiag() {
        s = Math.sqrt(three) * e;
        return s;
    }
}
