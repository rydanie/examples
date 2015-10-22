
import java.io.*;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * File Writing Example
 * @author woytek
 */
public class Ex8_1 {
 
    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException { // NOTE: handles IOException from PrintWriter!
        File myFile = new File( "myOutputFile.txt" );
        PrintWriter outputFile;
        Scanner keybd = new Scanner(System.in);
        String inputString;
        int inputInt;
        
        while( myFile.exists() ) {
            System.out.print( myFile.getName() + " exists. New name: " );
            inputString = keybd.nextLine();
            myFile = new File( inputString );
        }
        
        outputFile = new PrintWriter( myFile );
        
        System.out.print( "Please enter your name: " );
        inputString = keybd.nextLine();
        outputFile.println(inputString);
        
        System.out.print( "Please enter your age: " );
        inputInt = keybd.nextInt();
        keybd.nextLine(); // eat dead newline after nextInt
        outputFile.println(inputInt);
        
        System.out.print( "Please enter your hometown: " );
        inputString = keybd.nextLine();
        outputFile.println( inputString );
        
        System.out.print( "How many pets do you have? " );
        inputInt = keybd.nextInt();
        outputFile.println( inputInt );
        
        System.out.println( "All finished. Closing file." );
        outputFile.close();
    }
    
}
