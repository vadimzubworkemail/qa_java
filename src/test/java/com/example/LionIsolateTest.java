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
    Lion lion;


    @Test
    public void lionIsolateTest() throws Exception {

        Mockito.when(lion.getKittens()).thenReturn(7);
        Assert.assertEquals(7, lion.getKittens());
    }

}
