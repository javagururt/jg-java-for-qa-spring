package com.javaguru.lessons.lesson3;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberServiceTest {

    private NumberService victim;

    @Before
    public void setUp() throws Exception {
        victim = new NumberService();
    }

    @Test
    public void shouldCalculateSumInRange() {
        int actualResult = victim.sumInRange(1, 3);
        int expectedResult = 6;

        assertEquals(expectedResult, actualResult);
    }
}