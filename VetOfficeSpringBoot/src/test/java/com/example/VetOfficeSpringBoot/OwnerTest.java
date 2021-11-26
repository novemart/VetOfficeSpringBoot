package com.example.VetOfficeBoot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class OwnerTest {

    @InjectMocks
    private Owner owner = new Owner();

    @Mock
    private Cat cat;

    @Test
    public void makeCatSpeakLessThanZeroTest(){
        Assertions.assertEquals("no!", owner.makeCatSpeak(-1));
    }

    @Test
    public void makeCatSpeakMoreThanZeroTest(){
        Mockito.when(cat.makeCatSpeak(1)).thenReturn("meow meow");
        Assertions.assertEquals("meow meow", owner.makeCatSpeak(1));
    }
}
