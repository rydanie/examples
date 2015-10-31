
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
public class Ex5_3 {

    /**
     * main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long number = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print( "Enter a number to check for prime-ness: " );
        number = scanner.nextLong();
        
        if( isPrime( number ) ) {
            System.out.println( "Hey, it's prime!" );
        } else {
            System.out.println( "That number is not prime" );
        }
    }
    
    /**
     * isEven takes one integer number as an argument and returns true if the number is
     * even, and false if it is not.
     * @param number the number to check
     * @return true if number is even, false if number is odd
     */
    public static boolean isEven( long number ) {
        return number % 2 == 0;
    }
    
    /**
     * Determine if a number is prime.
     * @param number to check for prime-ness
     * @return true if prime, false if not prime
     */
    public static boolean isPrime( long number ) {
        System.out.print( "Checking prime-ness: " );
        if( number == 0 || number == 1 ) {
            // 1 is not prime
            System.out.println();
            return false;
        }
        if( isEven( number ) ) {
            // um, if it is even, it can't be prime
            System.out.println();
            return false;
        }
       
        for( long ctr = 3; ctr < number; ctr++ ) {
            if( ctr % 10 == 0 ) {
                System.out.print( "." );
            }
            if( number % ctr == 0 ) {
                System.out.println();
                System.out.println( "Divisible by: " + ctr );
                return false;
            }
        }
        System.out.println();
        return true;
    }
    
}
