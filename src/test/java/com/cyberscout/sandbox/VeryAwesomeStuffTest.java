package com.cyberscout.sandbox;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class VeryAwesomeStuffTest {

    @Parameters(name = "doSomethingAwesome({0}) == {1}")
    public static Iterable<Object[]> testData() {

        //@formatter:off
        return Arrays.asList(new Object[][] {
                { 1, "0x1 is awesome!" },
                { 20, "0x14 is awesome!" },
                { 42, "0x2A is awesome!" },
                { 1_357, "0x54D is awesome!" },
                { 51_966, "0xCAFE is awesome!" },
                { 789_514, "0xC0C0A is awesome!" },
                { 12_648_430, "0xC0FFEE is awesome!" },
        });
        //@formatter:on
    }


    private final int input;
    private final String expected;


    public VeryAwesomeStuffTest(int input, String expected) {

        this.input = input;
        this.expected = expected;
    }


    @Test
    public void testThatSomethingAwesomeIsDone() {

        assertEquals(this.expected, new VeryAwesomeStuff().doSomethingAwesome(this.input));
    }
}
