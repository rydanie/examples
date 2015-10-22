package src;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This example program goes through some more complex static method uses,
 * including arguments.
 * @author woytek
 */
public class Ex5_2 {

    /**
     * main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double totalScores = 0;
        int numScores = 0;
        int intInput = 0;
        double doubleInput = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print( "Enter a number: " );
        intInput = scanner.nextInt();
        if( isEven(intInput) ) {
            System.out.println( "The number entered is even!" );
        } else {
            System.out.println( "The number entered is odd!" );
        }
        
        System.out.print( "Enter the radius of a circle: " );
        doubleInput = scanner.nextDouble();
        System.out.println( "The area of the circle is: " + circleArea(doubleInput) );
        
        System.out.println( "Enter scores to average, -1 to stop:" );
        do {
             doubleInput = scanner.nextDouble();
             if( doubleInput > 100 || doubleInput < -1 ) {
                 System.out.println( "Invalid score (" + doubleInput + "), try again" );
             } else if( doubleInput != -1 ) {
                 totalScores += doubleInput;
                 numScores++;
             }
        } while( doubleInput != -1 );
        
        System.out.println( "Average score: " + averageScore( totalScores, numScores ) );
        
    }
    
    /**
     * isEven takes one integer number as an argument and returns true if the number is
     * even, and false if it is not.
     * @param number the number to check
     * @return true if number is even, false if number is odd
     */
    public static boolean isEven( int number ) {
        if( number % 2 == 0 ) {
            return true;
        } else { 
            return false;
        }
        
        // there is a more efficient way to do this:
        // return number % 2 == 0;
    }
    
    /**
     * circleArea calculates the area of a circle
     * @param radius of the circle
     * @return the area of the circle
     */
    public static double circleArea( double radius ) {
        return Math.PI * radius * radius;
        //return Math.PI * Math.pow( radius, 2 );
    }
    
    /**
     * Calculate and return the average score from a total.
     * @param total of scores
     * @param numScores number of scores in the total
     * @return the average of the scores
     */
    public static double averageScore( double total, int numScores ) {
        double avg = 0;
        
        // avoid an exception if we try to divide by zero...
        if( numScores > 0 ) {
            avg = total / numScores;
        }
        return avg;
    }
    
    
}
