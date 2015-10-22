/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Contains an integer circle (circle with integer radius).
 * @author woytek
 */
public class IntCircle {
    private int radius; // circle radius
    
    /**
     * Create the circle with radius r
     * @param r The radius
     */
    IntCircle( int r ) {
        radius = r;
    }
    
    /**
     * Get the radius of the circle.
     * @return double radius of the circle.
     */
    public int getRadius() {
        return radius;
    }
    
    /**
     * Get the circumference of the circle.
     * @return double circumference
     */
    public double circumference() {
        return 2.0 * Math.PI * radius;
    }
    
    /**
     * Get the area of the circle.
     * @return double area
     */
    public double area() {
        return Math.PI * radius * radius;
    }
    
    /**
     * Update the radius of the circle.
     * @param r integer radius
     */
    public void setRadius( int r ) {
        radius = r;
    }
    
    /**
     * Returns a string representation of the circle data.
     * @return String
     */
    public String toString() {
        return( "The circle has a radius of " + radius + "." );
    }
}
