package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionIsolateTest {
    @Mock
    Feline mockFeline;

    @Test
    public void lionIsolateTest() throws Exception {
        int expectedKittensCount = 7;
        Mockito.when(mockFeline.getKittens()).thenReturn(expectedKittensCount);
        Lion lion = new Lion("Самка",mockFeline);

        Assert.assertEquals(expectedKittensCount, lion.getKittens());
    }
}
