package src;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Example: Simple methods. 
 * This program demonstrates a simple method with a void return type (procedural)
 * and a method with a return type (functional)
 * @author woytek
 */
public class Ex5_1 {

    /**
     * main method
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( "Here I am writing in the main method" );
        System.out.println( "Now, let's call the sayHello method..." );
        
        sayHello(); // note the empty parens--there are no arguments to pass here
        
        System.out.println( "OK, now let's get that message from getMessage..." );
        
        getMessage(); // this is actually a bit of a problem. It doesn't do anything, does it?
        System.out.println( "Oops, nothing happened. Let's do that the right way..." );
        System.out.println( getMessage() ); // now this... this does something!
        
        System.out.println( "Alternate method: " );
        // alternate method that works just as well:
        String output = getMessage();
        System.out.println( output );
        
    	StringBuffer sb = new StringBuffer(getMessage());

        for( int i = 0; i < 5; i++ ) {
        	sayHello();
        	sb.append(" ");
        	sb.append(i);
        	System.out.println( sb );
        }
    }
    
    /**
     * The sayHello method displays a message that says hello
     */
    public static void sayHello() { // note empty parens--no arguments
        System.out.println( "Hello, you wonderful person, you!" );
    }
    
    /**
     * The getMessage method returns a hard-coded greeting
     * @return a string containing the message
     */
    public static String getMessage() { // note empty parens again--still no arguments
        return "You will have an awesome day today."; // we said we return a String, so we need to do that
    }
}
