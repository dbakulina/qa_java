package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test

    public void lionFoodTest() throws Exception {
        Lion lion = new Lion(feline);

        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actual = lion.getFood();
        assertEquals(expected,actual);

    }

    @Test

    public void lionGetKittens() throws Exception {
        Lion lion = new Lion(feline);

        int expected = 1;
        Mockito.when(lion.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        assertEquals(expected,actual);

    }

    @Test
    public void isLionHaveMainMan() throws Exception {
        Lion lion = new Lion("Самец");

        //Mockito.when(lion.doesHaveMane()).thenReturn(true);
        boolean actual = lion.doesHaveMane();
        assertEquals(true,actual);
    }

    @Test
    public void isLionHaveMainWoman() throws Exception {
        Lion lion = new Lion("Самка");
        boolean actual = lion.doesHaveMane();
        assertEquals(false,actual);
    }




}














