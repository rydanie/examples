package src;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Examples for the while loop
 * @author woytek
 */
public class Ex4_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // set up a few variables
        int ctr = 0;
        int ctr2 = 10;
        int foo = 0;
        String line;
        
        // simple while loop
        // is ctr < 10? Yes, so the first time through, we will execute the loop...
        while( ctr < 10 ) {
            //is ctr < 10? if so, execute...
            System.out.println( "First loop, ctr = " + ctr++ );
        }

        // same thing, but let's count down...
        while( ctr2 > 0 ) {
            System.out.println( "Second loop, ctr2 = " + ctr2-- );
        }
        
        // Let's use a loop to validate user input. 
        // Keep asking for numbers until the user enters "1915"
        Scanner keybd = new Scanner(System.in);
        System.out.print( "Enter a number (1915 to exit) [1]: " );
        while( keybd.nextInt() != 1915 ) {
            System.out.print( "Enter a number (1915 to exit) [1]: " );
        }
        
        // another way to do the same thing...
        while( foo != 1915 ) {
            System.out.print( "Enter a number (1915 to exit) [2]: " );
            foo = keybd.nextInt();
        }
        
        // what if we weren't sure that foo wasn't already 1915?
        // solution: use a post-test loop!
        do {
            System.out.print( "Enter a number (1915 to exit) [3]: " );
            foo = keybd.nextInt();
        } while( foo != 1915 );
        
        // or, if we don't need to keep the number for anything...
        do {
            System.out.print( "Enter 'q' to quit, any other key to continue: " );
            do {
                line = keybd.nextLine().toLowerCase(); 
            } while( line.equals( "" ) ); // eat newlines from above statements

        //} while( line.charAt(0) != 'q' );
        } while( !line.equals("q") );
        
        System.out.println( "OK, we're done!" );
    }
    
}
