package com.example.SpringCore.Couple.LooseCoupling;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cat implements Animal{

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
