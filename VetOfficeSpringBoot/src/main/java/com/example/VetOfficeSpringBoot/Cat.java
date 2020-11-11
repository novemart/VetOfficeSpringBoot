package com.example.VetOfficeSpringBoot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {

    @Value("Luna")
    private String name;
    public Cat (){

    }

    public String speak(){
        return "meow meow. My name is "+ this.name;
    }

    public String getName(){
        return this.name;
    }
}
