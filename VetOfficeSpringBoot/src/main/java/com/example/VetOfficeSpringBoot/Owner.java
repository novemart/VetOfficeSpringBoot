package com.example.VetOfficeSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    @Autowired
    Cat cat;

    public Owner(){
    }


    public String makeCatSpeak(){
        return cat.speak();
    }
}
