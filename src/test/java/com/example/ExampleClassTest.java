package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ExampleClassTest {

    @Test
    public void testAdd() {
        ExampleClass example = new ExampleClass();
        assertEquals(5, example.add(2, 3));
    }
}

