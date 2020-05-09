/*
 * File: Parallelepiped.java
 * Author: Gabriel Ribeiro

I affirm that this program is entirely my own work and none of it is the work
of anyone else.
 */
package Shape3D;

/**
 *A Parallelepiped has an area, a volume and an expression of its details 
 */
public class Parallelepiped extends Shape3D {
    
    private final String NAME = "Parallelepiped" ;
    private int length ;
    private int width ;
    private int height ;
    
    /**
     * Creates a Parallelepiped object
     * @param x the user-specified first coordinate
     * @param y the user-specified second coordinate
     * @param z the user-specified third coordinate
     * @param newL the user-specified length
     * @param newW the user-specified width
     * @param newH  the user-specified height
     */
    public Parallelepiped(int x, int y, int z, int newL, int newW, int newH){
        super(x, y, z) ;
        length = newL ;
        width = newW ;
        height = newH ;
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
     * @return  the area
     */
    public double GetArea(){
        double area = (2 * length * height) + (2 * length * width) + 
                (2 * height * width) ;
        return area ;
    }
    
    /**
     * Caculates the volume
     * @return the volume
     */
    public double GetVolume(){
        double volume = length * width * height ;
        return volume ;
    } 
    
    /**
     * Gives a representation of the details of the shape
     * @return an expression containing all the details
     */
    public String toString(){
        return "Shape: " + NAME + ", " + super.toString() + ", length " + length
                + ", width " + width + ", height " + height ;
    }
}
