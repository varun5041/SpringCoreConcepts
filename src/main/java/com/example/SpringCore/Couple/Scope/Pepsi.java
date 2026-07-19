package com.example.SpringCore.Couple.Scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pepsi {
    public Pepsi() {
        System.out.println("Pepsi Created!");
    }

    public void drinkPepsi(){
        System.out.println("Drinking pepsi");
    }
}
