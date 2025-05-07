package com.example.sonarqube;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleAdderTest {

    @Test
    @DisplayName("Should return correct sum of positive numbers")
    void testAddPositiveNumbers() {
        assertEquals(7, SimpleAdder.add(3, 4));
    }

    @Test
    @DisplayName("Should return correct sum with negative numbers")
    void testAddNegativeNumbers() {
        assertEquals(-1, SimpleAdder.add(2, -3));
    }

    @Test
    @DisplayName("Should return zero when adding zeros")
    void testAddZeros() {
        assertEquals(0, SimpleAdder.add(0, 0));
    }
}
