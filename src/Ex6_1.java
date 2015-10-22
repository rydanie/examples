/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Scope examples
 * @author woytek
 */
public class Ex6_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int foo = 6;
        //String someString = null;
        String someString;
        String otherString;
        Foo f1, f2, f3;
        
        f1 = new Foo( 10 );
        f2 = f1;
        
        someString = "some string here, yo!";
        otherString = "yo yo yo it's all about the bass fishing";
        
        System.out.println( "foo = " + foo );
        method();
        System.out.println( "foo = " + foo );
        
        System.out.println( "someString = " + someString );
        System.out.println( "length of someString = " + someString.length() );
        System.out.println( "otherString = " + otherString );
        
        otherString = someString;
        System.out.println( "otherString = " + otherString );
        otherString = otherString.concat(someString);
        System.out.println( "otherString = " + otherString );
        System.out.println( "someString = " + someString );
        
        System.out.println( "f1.foo = " + f1.getFoo() );
        System.out.println( "f2.foo = " + f2.getFoo() );
        
        f1.setFoo( 30 );
        System.out.println( "f1.foo = " + f1.getFoo() );
        System.out.println( "f2.foo = " + f2.getFoo() );
 
        if( f1 == f2 ) {
            System.out.println( "f1 and f2 are the same object" );
        }
        
        f2 = new Foo( 30 );
        
        f3 = new Foo( 30 );
        
        if( f1 == f3 ) {
            System.out.println( "f1 and f3 are the same object" );
        }
        
        if( f1.equals(f3) ) {
            System.out.println( "f1 and f3 have equivalent data in them" );
        }


    }
    
    public static void method() {
        int foo = 8;
        foo += foo;
        System.out.println( "foo = " + foo );
    }
    
    /**
     * class Foo does stuff.
     */
    public static class Foo {
        /**
         * Constructor.
         * @param f 
         */
        Foo( int f ) {
            foo = f;
        }
       
        public int getFoo() {
            return foo;
        }
        public void setFoo( int f ) {
            foo = f;
        }
        
        public boolean equals( Foo f ) {
            if( f.foo == foo ) {
                return true;
            } else {
                return false;
            }
        }
        private int foo;
    }
    
}
