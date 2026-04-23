package com.bnmit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    App app = new App();

    @Test
    public void addTest(){
        int expectedOut = 4;
        int actualOut = app.add(2, 2);
        assertEquals(expectedOut, actualOut);  
    }
    @Test
    public void multiplyTest(){
        int expectedOut = 8;
        int actualOut = app.mul(4, 2);
        assertEquals(expectedOut, actualOut);  
    }
    @Test
    public void subtractTest(){
        int expectedOut = 4;
        int actualOut = app.add(4, 2);
        assertEquals(expectedOut, actualOut);  
    }
    @Test
    public void divideTest(){
        assertThrows(ArithmeticException.class, () -> {app.divide(10, 0);}); 
    }


}
