package com.example.SpringCore.Couple.LooseCoupling;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Dog implements Animal{

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}
