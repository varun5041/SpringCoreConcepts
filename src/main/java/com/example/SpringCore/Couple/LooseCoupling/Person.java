package com.example.SpringCore.Couple.LooseCoupling;

import com.example.SpringCore.Couple.BeanDeclaration.Samosa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

//    @Autowired
    Animal animal;
    @Autowired
    Samosa samosa;

//    @Autowired
//    public Person( @Qualifier("dog") Animal animal) {
//        this.animal = animal;
//    }


    @Autowired
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void playWithAnimal(){
        animal.play();
    }

    public void eat(){
       samosa.eatSamosa();
    }
}
