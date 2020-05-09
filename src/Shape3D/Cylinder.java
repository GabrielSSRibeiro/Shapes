/*
 * File: Cone.java
 * Author: Gabriel Ribeiro

I affirm that this program is entirely my own work and none of it is the work
of anyone else.
 */
package Shape3D;

/**
 *A Cylinder has an area, a volume and an expression of its details 
 */
public class Cylinder extends Shape3D{
    
    private final String NAME = "Cylinder" ;    
    private int height ;
    private int radius ;
    
    /**
     * Creates a Cylinder object
     * @param x the user-specified first coordinate
     * @param y the user-specified second coordinate
     * @param z the user-specified third coordinate
     * @param newH the user-specified height
     * @param newRadius the user-specified radius
     */
    public Cylinder(int x, int y, int z, int newH, int newRadius){
        super(x, y, z) ;
        height = newH ;
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
        double area = 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * 
                radius * height ;
        return area ;
    }
    
    /**
     * Caculates the volume
     * @return the volume
     */
    public double GetVolume(){
        double volume = Math.PI * Math.pow(radius, 2) * height ;
        return volume ;
    } 
    
    /**
     * Gives a representation of the details of the shape
     * @return an expression containing all the details
     */
    public String toString(){
        return "Shape: " + NAME + ", " + super.toString() + ", height " + height + 
                ", radius of " + radius ;
    }
}
