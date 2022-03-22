package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionParamExceptionTest {
    @Mock
    Feline mockFeline;
    private final String sex;

    public LionParamExceptionTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getException() {
        return new Object[][]{
                {" Самец"},
                {"Самка "},
                {"самец"},
                {"САМКА"},
                {"Сам ец"},
                {"Samka"}
        };

    }

    @Test(expected = Exception.class)
    public void hasManeTest() throws Exception {
        Lion lion = new Lion(sex, mockFeline);
        String expectedText = "Используйте допустимые значения пола животного - самец или самка";
        Assert.assertEquals(expectedText, lion.doesHaveMane());
    }
}