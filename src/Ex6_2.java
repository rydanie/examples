
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
public class Ex6_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contact testContact = new Contact();
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        System.out.print( "Enter the last name: " );
        input = keyboard.nextLine();
        testContact.setLastName( input );
        
        System.out.println( "Last name: " + testContact.getLastName() );
    }
    
    public static class Contact {
        Contact() {
        }
        
        public void setLastName( String n ) {// regular expression
            
            if( !n.matches("^[A-Za-z]+$") ) {// if it doesn't equal a-z print
                System.out.println( "Invalid characters in last name" );// input validation
            } else {
                lName = n;
            }
        }
        public String getLastName() {
            return lName;
        }
        public void setFirstName( String n ) {
            fName = n;
        }
        public String getFirstName() {
            return fName;
        }
        public void setMiddleName( String n ) {
            mName = n;
        }
        public String getMiddleName() {
            return mName;
        }
        /*
         * Name (first, last, middle)
         * Prefix (Mr/Dr/Mrs)
         * Phone number
         * email
         * address (street, city, state, zip)
         * occupation
        */
        private String lName,fName, mName;
        private String prefix;
        private String phone;
        private String email;
        private String street, city, state, zip;
        private String occupation;
        
        
        
    }
    
}
