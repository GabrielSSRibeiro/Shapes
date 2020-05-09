/*
 * File: Point3D.java
 * Author: Gabriel Ribeiro

I affirm that this program is entirely my own work and none of it is the work
of anyone else.
 */
package Shape3D;

/**
 *A Point3D has three coordinates and can return then individually or together 
 * as a string
 */
public class Point3D {
    private int x ; //the first coordinate
    private int y ; //the second coordinate
    private int z ; //the third coordinate
    
    /**
     * Creates a Point3D object
     * @param newX user specified first coordinate
     * @param newY user specified second coordinate
     * @param newZ user specified third coordinate
     */
    public Point3D(int newX, int newY, int newZ){
        x = newX ;
        y = newY ;
        z = newZ ;
    }
    
    /**
     * gets the specific coordinate
     * @return the first coordinate
     */
    public int GetX(){
        return x ;
    }
    
    /**
     * gets the specific coordinate
     * @return the second coordinate
     */
    public int GetY(){
        return y ;
    }
    
    /**
     * gets the specific coordinate
     * @return the third coordinate
     */
    public int GetZ(){
        return z ;
    }
    
    /**
     * Gives a representation of the three coordinates
     * @return an expression of the three coordinates
     */
    public String toString(){
        return ("(" + x + ", " + y + ", " + z + ")") ;
    }
    
}
