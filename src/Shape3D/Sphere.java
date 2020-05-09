/*
 * File: Sphere.java
 * Author: Gabriel Ribeiro

I affirm that this program is entirely my own work and none of it is the work
of anyone else.
 */
package Shape3D;

/**
 *A Sphere has an area, a volume and an expression of its details 
 */
public class Sphere extends Shape3D {
    private final String NAME = "Sphere" ;
    private int radius ;
    
    /**
     * Creates a Sphere object
     * @param x the user-specified first coordinate
     * @param y the user-specified second coordinate
     * @param z the user-specified third coordinate
     * @param newRadius the user-specified radius
     */
    public Sphere(int x, int y, int z, int newRadius){
        super(x, y, z) ;
        radius = newRadius ;
    }
    
    /**
     * Gets the name of the shape
     * @return the shapes's name
     */
    public String GetName(){
        return NAME ;
    }
    
    /**
     * Caculates the area
     * @return the area
     */
    public double GetArea(){
        double area = 4 * Math.PI * Math.pow(radius, 2) ;
        return area ;
    }
    
    /**
     * Caculates the volume
     * @return the volume
     */
    public double GetVolume(){
        double volume = (4 * Math.PI * Math.pow(radius, 3)) / 3 ;
        return volume ;
    } 
    
    /**
     * Gives a representation of the details of the shape
     * @return an expression containing all the details
     */
    public String toString(){
        return "Shape: " + NAME + ", " + super.toString() + ", radius of " + radius ;
    }
}
