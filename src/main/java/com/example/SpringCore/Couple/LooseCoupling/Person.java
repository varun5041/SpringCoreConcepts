package com.example.SpringCore.Couple.LooseCoupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    @Qualifier("cat")
    Animal animal;

//    @Autowired
//    public Person( @Qualifier("dog") Animal animal) {
//        this.animal = animal;
//    }

    public void playWithAnimal(){
        animal.play();
    }
}
