package com.sage.app;

/**
 * FizzBuzz
 */
public class App 
{
    public static void main( String[] args ) {}

    public void fizzBuzz(int start, int end) {

        int fizz = 3;
        int buzz = 5;

        if (end < start) {
            throw new IllegalArgumentException();
        }

        for ( int i = start; i <= end; i++ ) {
            if ( i % fizz == 0 && i % buzz == 0) {
                System.out.print( "fizzbuzz " );
            } else if ( i % buzz == 0 ) {
                System.out.print( "buzz " );
            } else if ( i % fizz == 0 ) {
                System.out.print( "fizz " );
            } else {
                System.out.print( i + " ");
            }
        }
    }
}
