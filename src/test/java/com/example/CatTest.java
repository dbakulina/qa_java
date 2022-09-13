package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;


    @Test

    public void catGetFoodTest() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = cat.getFood();
        assertEquals(List.of("Животные", "Птицы", "Рыба"),actual);

    }
//Замечание 2 закоммитить
    @Test

    public void catGetSoundTest() {
        Cat cat = new Cat(feline);

        String actual = cat.getSound();
        assertEquals("Мяу",actual);

    }
}
