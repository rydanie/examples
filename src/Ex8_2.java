
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Arrays are fun and profitable.
 * @author woytek
 */
public class Ex8_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] intArray = new int[5];
        IntCircle [] circlesOfLife;
        Scanner keybd = new Scanner(System.in);
        int tmp = 0;
        
        System.out.print( "Please enter the number of circles you want: " );
        tmp = keybd.nextInt();
        
        circlesOfLife = new IntCircle[tmp];
        
        for( int ctr = 0; ctr < circlesOfLife.length; ctr++ ) {
            System.out.print( "Enter the radius of circle #" + (ctr+1) + ": " );
            circlesOfLife[ctr] = new IntCircle( keybd.nextInt() );
        }
        
        for( int ctr = 0; ctr < circlesOfLife.length; ctr++ ) {
            System.out.println( "Circle #" + (ctr+1) + ":" );
            System.out.print( "\tcirc: " + circlesOfLife[ctr].circumference() + "\tarea: " + circlesOfLife[ctr].area() + "\n" );
        }
    }
    
}
