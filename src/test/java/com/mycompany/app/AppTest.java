package com.mycompany.app;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
for (int i=0; i < 10000; i++) {
System.out.println(i);
        assertEquals("foo", "foo");
        assertNotEquals("foo", "bar");
        assertNotEquals(new Object(), new Object());
}
    }
}
