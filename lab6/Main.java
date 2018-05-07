package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        //№1
        Pegas pegi = new Pegas();
        pegi.fly();

        //№2

        System.out.println("Кошка");
        Cat meow = new Cat();

        //№3
        System.out.println("Человек");
        Human human = new Human();

        System.out.println("Обезьяна");
        Ape ape = new Ape();

        System.out.println("Рыба");
        Fish fish = new Fish();

        System.out.println("Животное");
        Animal animal = new Animal();

        human.interaction(animal);
        human.interaction(fish);
        human.interaction(ape);
    }
}
