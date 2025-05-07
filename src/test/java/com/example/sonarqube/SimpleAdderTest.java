package com.example.sonarqube;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleAdderTest {

    @Test
    public void testAdd() {
        assertEquals(5, SimpleAdder.add(2, 3));
        assertEquals(0, SimpleAdder.add(-2, 2));
        assertEquals(-10, SimpleAdder.add(-5, -5));
    }
}
