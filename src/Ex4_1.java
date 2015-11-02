/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Examples for increment/decrement operators
 * @author woytek
 */
public class Ex4_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a few variables
        int foo = 0;
        int bar = 0;
        int baz = 0;
        
        // output variable values
        System.out.println( "Initial values:" );
        System.out.println( "foo\tbar\tbaz" );
        System.out.printf( "%4d\t%4d\t%4d\n\n", foo, bar, baz );
        
        // make some changes:
        System.out.println( "foo++\t++bar\tbaz+=1" );
        System.out.printf( "%5d\t%5d\t%5d\t(during execution)\n", foo++, ++bar, baz+=1 );
        System.out.printf( "%5d\t%5d\t%5d\t(after execution)\n\n", foo, bar, baz );

        // make some prefix changes:
        System.out.println( "++foo\tbar++\tbaz+=1" );
        System.out.printf( "%5d\t%5d\t%5d\t(during execution)\n", ++foo, bar++, baz+=1 );
        System.out.printf( "%5d\t%5d\t%5d\t(after execution)\n\n", foo, bar, baz );

        // make some changes:
        System.out.println( "foo--\t--bar\tbaz-=1" );
        System.out.printf( "%5d\t%5d\t%5d\t(during execution)\n", foo--, --bar, baz-=1 );
        System.out.printf( "%5d\t%5d\t%5d\t(after execution)\n\n", foo, bar, baz );

        // make some prefix changes:
        System.out.println( "--foo\tbar--\tbaz-=1" );
        System.out.printf( "%5d\t%5d\t%5d\t(during execution)\n", --foo, bar--, baz-=1 );
        System.out.printf( "%5d\t%5d\t%5d\t(after execution)\n", foo, bar, baz );


        // make some other changes
    }
    
}
