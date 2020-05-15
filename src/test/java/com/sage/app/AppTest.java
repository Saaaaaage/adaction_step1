package com.sage.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.io.*;

public class AppTest 
{
    /*
    * Pulled from StackOverflow
    * https://stackoverflow.com/questions/1119385/junit-test-for-system-out-println
    */
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    // End StackOverflow pull
    


    @Test(expected = IllegalArgumentException.class)
    public void testFizzBuzzReverseRange() {
        // Given
        App appTest = new App();

        // When
        int testStart = 20;
        int testEnd = 1;
        appTest.fizzBuzz(testStart, testEnd);

        // Then
        // Expect IllegalArgumentException
    }


    @Test
    public void testFizzBuzzNumber() throws Throwable {
        // Given
        App appTest = new App();

        // When
        int testStart = 1;
        int testEnd = 1;
        appTest.fizzBuzz(testStart, testEnd);

        // Then
        assertEquals("1 ", outContent.toString());
    }

    @Test
    public void testFizzBuzzBuzz() throws Throwable {
        // Given
        App appTest = new App();

        // When
        int testStart = 55;
        int testEnd = 55;
        appTest.fizzBuzz(testStart, testEnd);

        // Then
        assertEquals("buzz ", outContent.toString());
    }

    @Test
    public void testFizzBuzzFizz() throws Throwable {
        // Given
        App appTest = new App();

        // When
        int testStart = 24;
        int testEnd = 24;
        appTest.fizzBuzz(testStart, testEnd);

        // Then
        assertEquals("fizz ", outContent.toString());
    }

    @Test
    public void testFizzBuzzFizzBuzz() throws Throwable {
        // Given
        App appTest = new App();

        // When
        int testStart = 75;
        int testEnd = 75;
        appTest.fizzBuzz(testStart, testEnd);

        // Then
        assertEquals("fizzbuzz ", outContent.toString());
    }

    @Test
    public void testFizzBuzzMulti() throws Throwable {
        // Given
        App appTest = new App();

        // When
        int testStart = 1;
        int testEnd = 20;
        appTest.fizzBuzz(testStart, testEnd);

        // Then
        String expected = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz ";
        assertEquals(expected, outContent.toString());
    }

    @Test
    public void testFizzBuzzNegative() throws Throwable {
        // Given
        App appTest = new App();

        // When
        int testStart = -20;
        int testEnd = -1;
        appTest.fizzBuzz(testStart, testEnd);

        // Then
        String expected = "buzz -19 fizz -17 -16 fizzbuzz -14 -13 fizz -11 buzz fizz -8 -7 fizz buzz -4 fizz -2 -1 ";
        assertEquals(expected, outContent.toString());
    }
}
