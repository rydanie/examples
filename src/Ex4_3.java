/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Example for loops
 * @author woytek
 */
public class Ex4_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a couple of vars
        int ctr = 0;
        int foo = 0;
        int pCount = 0;
        boolean flag = false;
        
        // simple, let's count from 0 to 5...
        for( ctr = 0; ctr <= 5; ctr++ ) {
            System.out.println( "ctr = " + ctr );
        }
        
        // more complex, let's count by twos from 0 to 10
        for( ctr = 0; ctr <= 10; ctr += 2 ) {
            System.out.println( "ctr = " + ctr );
        }
        
        // more complex yet, let's print out the multiples of 7 between 0 and 100
        for( ctr = 0; ctr <= 100; ctr++ ) {
            if( ctr % 7 == 0 ) {
                // if the remainder of ctr / 7 is 0, then...
                System.out.print( ctr + ", " );
            }
        }
        System.out.println();
        
        // backwards?
        for( ctr = 100; ctr >= 0; ctr-- ) {
            if( ctr % 7 == 0 ) {
                // if the remainder of ctr / 7 is 0, then...
                System.out.print( ctr + ", " );
            }
        }
        System.out.println();
        
        // Reverse a string?
        String input = "Jonathan";
        for( ctr = input.length() - 1; ctr >= 0; ctr-- ) {
            System.out.print( input.charAt(ctr) );
        }
        System.out.println();
        
        // Reverse a string, but put it into another string variable?
        String output = "";
        for( ctr = input.length() - 1; ctr >= 0; ctr-- ) {
            output += String.valueOf(input.charAt(ctr));
        }
        System.out.println( output );
        
        // OK, let's go crazy and print the primes between 1 and 10000:
        // goofy: 1 isn't a prime number, by definition of a prime
        // (source: https://primes.utm.edu/notes/faq/one.html), so
        // we have to start our counter at 2!
        System.out.println( "Primes between 1 and 10000: " );
        for( ctr = 2; ctr <= 10000; ctr++ ) {
            // start off assuming prime
            flag = true;
            for( foo = 2; foo < ctr && flag; foo++ ) {
                if( ctr % foo == 0 ) {
                    flag = false;
                }
            }
            if( flag ) {
                System.out.printf( "%5d, ", ctr );
                pCount++;
                if( pCount % 10 == 0 ) {
                    // make it pretty--print a newline every 10 primes
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println( "Finished. Found " + pCount + " primes." );
    }
    
}
