package examples;

import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex8_3 {

 public static void main(String[] args) throws IOException { // NOTE: handles IOException from PrintWriter!
	 File myFile = new File( "myOutputFile.txt" );
     //PrintWriter outputFile;
     BufferedReader inputFile;
	 Scanner keybd = new Scanner(System.in);
     String inputString;
     int inputInt;
     int c = 1;
     
     while( !myFile.exists()){
    	  
         System.out.print( myFile.getName() + " File Does not exists. new Name: " );
         inputString = keybd.nextLine();
         myFile = new File( inputString );
     }
      
     inputFile = new BufferedReader(new FileReader( myFile ));
     
     /* while( myFile.exists() ) { // input validation needed stops damage
     System.out.print( myFile.getName() + " exists. New name: " );
     inputString = keybd.nextLine();
     myFile = new File( inputString );
 	}
     */
    inputFile.mark(256);
     while( inputFile.ready() ) {
    	 inputString = inputFile.readLine();
    	 System.out.println( "line [" + c++ + "] = " + inputString);
    	 
     }
     
     inputFile.reset();
     
     Stream<String> newStream;
     
     newStream = inputFile.lines();
     
     newStream.forEach( s -> { System.out.println(s); } );
     
     inputFile.close();
 }
    
}
