/*
 * File: Shape3DTester.java
 * Author: Gabriel Ribeiro
 * This class creates different shapes and prints their details by looping 
through an array. First, it prints the shapes and their araes without any 
sorting. Second, it prints the shapes and their volumes in discending order of 
volume. Last, it prints the shapes and their distances from the origin(0,0,0)
in ascending order.

 */
package Shape3D;

import java.util.Arrays;
import java.util.Comparator;

/**
 *Tester class that creates shapes and prints their details after diffrent 
 * forms of sorting.
 */
public class Shape3DTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //inner class implements Comparator for Shape3D class
        class DistanceComparator implements Comparator{
            
            /**
             * Compares two objects based on their distance from the origin(0,0,0)
             * @param firstObject the frist object to be compared
             * @param secondObject the second object to be compared
             * @return an indicator whether firstObject comes before or after 
             * secondOjbect or 0 if they are equal 
             */
            public int compare(Object firstObject, Object secondObject){
         
                double d1 = ((Shape3D) firstObject).GetDistance() ;
                double d2 = ((Shape3D) secondObject).GetDistance() ;

                // order based on distance, ascending
                if(d1 < d2){  //d1 comes first
                    return -1 ;
                }
                if(d1 > d2){  //d2 comes first
                    return 1 ;
                }
                else {   // they are equal
                    return 0 ;
                }            
            }
        }  
        
        DistanceComparator comp = new DistanceComparator();
        
        //array of all the shapes
        Shape3D[] shapes = {new Sphere(2, 5, 8, 14), 
            new Parallelepiped(7, 16, 9, 19, 9, 13), 
            new Cylinder(-3, -7, 5, 12, 14), 
            new Cone(-5, 4, -1, 15, 11)} ;
        
        //prints: shape, all the input data, and the surface area
        for(int i = 0; i < shapes.length ; i++){
            System.out.println(shapes[i].toString()) ;
            System.out.println("Area: " + 
                    String.format("%.2f",shapes[i].GetArea())) ;
            System.out.println("") ;
        }
        
        //sorts the array based on compareTo
        Arrays.sort(shapes) ;
        System.out.println("------------------------------------------------") ;
        System.out.println("") ;

        //prints: the shape and the volume
        for(int i = 0; i < shapes.length ; i++){
            System.out.println(shapes[i].GetName()) ;
            System.out.println("Volume: " + 
                    String.format("%.2f",shapes[i].GetVolume())) ;
            System.out.println("") ;               
        }
        
        //sorts the array using the overloaded version based on compare
        Arrays.sort(shapes, comp) ;
        System.out.println("------------------------------------------------") ;
        System.out.println("") ;
        
        //prints: the shape and the volume
        for(int i = 0; i < shapes.length ; i++){
            System.out.println(shapes[i].GetName()) ;
            System.out.println("Distance: " + 
                    String.format("%.2f",shapes[i].GetDistance())) ;
            System.out.println("") ;               
        }       
        
    }
    
}
