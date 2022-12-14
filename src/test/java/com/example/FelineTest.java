package com.example;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
public class FelineTest {
    @Test
    public void eatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        System.out.println(actual);
        assertEquals(List.of("Животные", "Птицы", "Рыба"),actual);
    }
    @Test
    public void getFamily() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        assertEquals("Кошачьи",actual);
    }
    @Test
    public void getKittens() {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        assertEquals(1,actual);
    }
    @Test
    public void testGetKittens() {
    }
}