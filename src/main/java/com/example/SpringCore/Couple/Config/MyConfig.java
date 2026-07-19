package com.example.SpringCore.Couple.Config;

import com.example.SpringCore.Couple.BeanDeclaration.Samosa;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfig {
    //declaring Bean
    @Bean
    public Samosa getSamosa(){
        return new Samosa("Tandoori samosa");
    }

    @Bean
    @Primary
    public Samosa getSamosa2(){
        return new Samosa("Cheese Samosa");
    }
}
