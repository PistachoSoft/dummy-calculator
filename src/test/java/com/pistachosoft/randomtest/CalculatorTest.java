package com.pistachosoft.randomtest;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CalculatorTest {

    private Calculator sut;

    @Before
    public void setUp() {
        sut = new Calculator();
    }

    @Test
    public void add() {
        int result = sut.add(2, 3);

        assertThat(result, is(5));
    }
}
