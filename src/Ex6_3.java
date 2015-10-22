
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author woytek
 */
public class Ex6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        IntCircle circle;
        
        System.out.print( "Enter radius for circle (int): " );
        circle = new IntCircle(in.nextInt());
        
        System.out.println( circle );
        System.out.println( "Circumference: " + circle.circumference() );
        System.out.println( "Area: " + circle.area() );
        
        System.out.println( "Changing radius to 5..." );
        circle.setRadius( 5 );
        
        System.out.println( circle );
        System.out.println( "Circumference: " + circle.circumference() );
        System.out.println( "Area: " + circle.area() );
 
        
    }
    
}
