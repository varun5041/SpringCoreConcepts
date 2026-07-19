package com.example.SpringCore;

import Test.test;
import com.example.SpringCore.Couple.BeanDeclaration.Samosa;
import com.example.SpringCore.Couple.LooseCoupling.Animal;
import com.example.SpringCore.Couple.LooseCoupling.Cat;
import com.example.SpringCore.Couple.LooseCoupling.Dog;
import com.example.SpringCore.Couple.LooseCoupling.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@SpringBootApplication
@ComponentScan(basePackages = {"Test","com.example.SpringCore"})
public class SpringCoreApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(SpringCoreApplication.class, args);

//        Person p = new Person(new Dog());
//        Person p2 = new Person(new Cat());
//
//        p.playWithAnimal();
//        p2.playWithAnimal();

        /// ////////////////////////////////////

//        Person personBean = context.getBean(Person.class);
//        personBean.setAnimal(context.getBean(Dog.class));
//        personBean.playWithAnimal();
//
//        Animal cat = context.getBean("cat", Animal.class);
//        cat.play();
//
//        test testBean= context.getBean(test.class);
//        testBean.HelloPrint();

        Samosa samosa = context.getBean(Samosa.class);
        samosa.eatSamosa();

        Person person1= context.getBean(Person.class);
        person1.eat();



	}


//    //declaring Bean
//    @Bean
//    public Samosa getSamosa(){
//        return new Samosa("Tandoori samosa");
//    }
//
//    @Bean
//    @Primary
//    public Samosa getSamosa2(){
//        return new Samosa("Cheese Samosa");
//    }

}
