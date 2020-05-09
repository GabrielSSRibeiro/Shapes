/*
 * File: Cone.java
 * Author: Gabriel Ribeiro

I affirm that this program is entirely my own work and none of it is the work
of anyone else.
 */
package Shape3D;

/**
 *A Cone has an area, a volume and an expression of its details 
 */
public class Cone extends Shape3D{

    private final String NAME = "Cone" ;
    private int height ;
    private int radius ;
    
    /**
     * Creates a Cone object
     * @param x the user-specified first coordinate
     * @param y the user-specified second coordinate
     * @param z the user-specified third coordinate
     * @param newH the user-specified height
     * @param newRadius the user-specified radius
     */
    public Cone(int x, int y, int z, int newH, int newRadius){
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
        double s = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2)) ;
        double area = Math.PI * radius * (radius + s) ;
        return area ;
    }
    
    /**
     * Caculates the volume
     * @return the volume
     */
    public double GetVolume(){
        double volume = (Math.PI * Math.pow(radius, 2) * height) / 3 ;
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
