package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionParamTest {
    @Mock
    Feline mockFeline;

    private final String sex;
    private final boolean hasMane;

    public LionParamTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] haveMane() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void hasManeTest() throws Exception {
        Lion lion = new Lion(sex, mockFeline);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(hasMane, actual);
    }

}