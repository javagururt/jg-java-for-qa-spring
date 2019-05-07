package com.javaguru.lessons.lesson4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayServiceTest {

    private ArrayService victim;

    @Before
    public void setUp() throws Exception {
        victim = new ArrayService();
    }

    @Test
    public void shouldFindMax() {
        int[] array = {1, 7, 9, 15, 99, 0, -3};

        int expected = 99;
        int actual = victim.findMaxValue(array);

        assertEquals(expected, actual);
    }
}