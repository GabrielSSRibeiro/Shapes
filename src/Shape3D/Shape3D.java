/*
 * File: Shape3D.java
 * Author: Gabriel Ribeiro

I affirm that this program is entirely my own work and none of it is the work
of anyone else.
 */
package Shape3D;

/**
 *A Shape3D has a center, a distance from the origin and a way to compare the 
 * volume of objects implementing Java’s Comparable interface 
 */
public abstract class Shape3D implements Comparable {
    
    private Point3D center ; //The center of shape based of three coordinates
    
    /**
     * Creates a Shape3D object
     * @param x the user-specified first coordinate
     * @param y the user-specified second coordinate
     * @param z the user-specified third coordinate
     */
    public Shape3D(int x, int y, int z){
        center = new Point3D(x , y, z) ;
    }
    
    /**
     * Calculates the distance from the origin(0,0,0)
     * @return the distance
     */
    public double GetDistance(){
        double distance = Math.sqrt(Math.pow(center.GetX(), 2) + 
                Math.pow(center.GetY(), 2) + Math.pow(center.GetZ(), 2)) ;
        return distance ;
    }
    
    /**
     * calls the GetName method for the class that implements this
     * @return the name of the shape
     */
    public abstract String GetName() ;    
    
    /**
     * calls the GetArea method for the class that implements this
     * @return the area of the shape
     */
    public abstract double GetArea() ;
    
    /**
     * calls the GetVolume method for the class that implements this
     * @return the volume of the shape
     */
    public abstract double GetVolume() ; 
           
    /**
     * Compares two objects based on their volume
     * @param otherObject the user-specified object to be compared to
     * @return an indicator whether firstObject comes before or after 
     * secondOjbect or 0 if they are equal 
     */
    public int compareTo(Object otherObject)
    {
        Shape3D other = (Shape3D)otherObject ;
        
        // order based on volume, descending
        if (this.GetVolume() > other.GetVolume()){ //v1 comes first
                return -1 ;
        }
        else if (this.GetVolume() < other.GetVolume()){ //v2 comes first
                return 1 ;
        }
        else{	// they are equal
                return 0 ;
        }
    }
    
    /**
     * Gives an representation of the center coordinates
     * @return an expression of the center
     */
    public String toString(){
        return "center at " + center.toString() ;
    }
}
