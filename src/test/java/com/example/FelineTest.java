package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    @Test
    public void getFamilyTest() {
        final String expectedFamily = "Кошачьи";
        Feline feline = new Feline();
        Assert.assertEquals(expectedFamily, feline.getFamily());
    }

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        final List<String> felineFood = feline.eatMeat();
        Assert.assertTrue(felineFood.size() == 3);
        Assert.assertTrue(felineFood.contains("Животные"));
        Assert.assertTrue(felineFood.contains("Птицы"));
        Assert.assertTrue(felineFood.contains("Рыба"));
    }

    @Test
    public void getKittensTest(){
        Feline feline = new Feline();
        final int expectedKittensCount = 3;
        int kittensCount = feline.getKittens(expectedKittensCount);
        Assert.assertEquals(expectedKittensCount, kittensCount);
    }

    @Test
    public void checkKittensTest(){
        Feline feline = new Feline();
        int kittensCount = 1;
        Assert.assertEquals(kittensCount, feline.getKittens());
    }
}