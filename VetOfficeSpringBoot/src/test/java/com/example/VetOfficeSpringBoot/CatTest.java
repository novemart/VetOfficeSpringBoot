package com.example.VetOfficeBoot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;


public class CatTest {

    @Test
    public void speakLessThanTwoTest(){
        int i = 1;
        Cat cat = new Cat();
        Assertions.assertEquals("meow meow meow", cat.makeCatSpeak(i));
    }
}
