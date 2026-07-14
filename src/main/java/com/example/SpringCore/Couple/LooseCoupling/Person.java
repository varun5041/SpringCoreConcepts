package com.example.SpringCore.Couple;

public class Person {
    Animal animal;

    public Person(Animal animal) {
        this.animal = animal;
    }

    public void playWithAnimal(){
        animal.play();
    }
}
