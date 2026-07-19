package com.example.SpringCore.Couple.BeanDeclaration;




public class Samosa {

    String name;
    public Samosa(String name) {
        this.name=name;
    }

    public void eatSamosa(){
        System.out.println("eating Samosa : " + name);
    }
}
