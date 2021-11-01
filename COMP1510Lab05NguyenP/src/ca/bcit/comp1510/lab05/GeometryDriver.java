package ca.bcit.comp1510.lab05;

import java.util.Scanner;

import java.text.DecimalFormat;

/** Drive Sphere, Cube, Cone program.
 * @author Phuong
 * @version 1.0
 */
public class GeometryDriver {

    /** Drive Sphere, Cube, Cone programs.
     * @param args unused
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        
        //Sphere
        
        //Declare variables for the information of the sphere.
        double r;
        double x;
        double y;
        double z;
        double a;
        double v;
        
        System.out.println("Please enter Sphere's radius: ");
        r = scan.nextDouble();
        
        System.out.println("Please enter Sphere's X-Coordiate: ");
        x = scan.nextDouble();
        
        System.out.println("Please enter Sphere's Y-Coordiate: ");
        y = scan.nextDouble();
        
        System.out.println("Please enter Sphere's Z-Coordiate: ");
        z = scan.nextDouble();
        
        Sphere sphere = new Sphere(r, x, y, z);
        
        a = sphere.surfaceArea();
        System.out.println("Sphere's Surface area: " + decimalFormat.format(a));

        v = sphere.volume();
        System.out.println("Sphere's volume: " + decimalFormat.format(v));
        
        //Cube
        
        //Declare variables for the information of the cube.
        double xCube;
        double yCube;
        double zCube;
        double eCube;
        double aCube;
        double vCube;
        double faceDiag;
        double spaceDiag;
        
        
        System.out.println("Please enter Cube's X-Coordiate: ");
        xCube = scan.nextDouble();
        
        System.out.println("Please enter Cube's Y-Coordiate: ");
        yCube = scan.nextDouble();
        
        System.out.println("Please enter Cube's Z-Coordiate: ");
        zCube = scan.nextDouble();
        
        System.out.println("Please enter Cube's Edge length: ");
        eCube = scan.nextDouble();
        
        Cube cube = new Cube(xCube, yCube, zCube, eCube);
        
        aCube = cube.surfaceArea();
        System.out.println("Cube's Surface area: " 
                + decimalFormat.format(aCube));

        vCube = sphere.volume();
        System.out.println("Cube's volume: " + decimalFormat.format(vCube));
        
        faceDiag = cube.faceDiag();
        System.out.println("Cube's Face Diagonal: " 
                + decimalFormat.format(faceDiag));

        spaceDiag = cube.spaceDiag();
        System.out.println("Cube's Space Diagonal: " 
                + decimalFormat.format(spaceDiag));
        
        //Cone
        
        //Declare variables for the information of the cone.
        double hCone;
        double rCone;
        double slantHeight;
        double aCone;
       
        
        System.out.println("Please enter value of Cone's height: ");
        hCone = scan.nextDouble();
        
        System.out.println("Please enter value of Cone's radius: ");
        rCone = scan.nextDouble();
        
        Cone cone = new Cone(rCone, hCone);
        
        slantHeight = cone.slantHeight();
        System.out.println("Cone's Slant height: " 
                + decimalFormat.format(slantHeight));
        
        aCone = cone.surfaceArea();
        System.out.println("Cone's Surface area: " 
                + decimalFormat.format(aCone));
        
        
        scan.close();

    }

}
