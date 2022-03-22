package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CatTest {
    @Test
    public void checkCatSoundTest() {
        final String expectedSound = "Мяу";
        Cat cat = new Cat(new Feline());

        Assert.assertEquals(expectedSound, cat.getSound());
    }

    @Test
    public void checkCatFoodListTest() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> catFoodList = cat.getFood();

        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), catFoodList);

    }
}