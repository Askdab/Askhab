package com.company;

public class Cat extends Pet {
    public Cat(String name, int age, boolean hungry) {
        setName(name);
        setAge(age);
        setHungry(hungry);
    }

    public void voice() {
        System.out.println("Мяу!");
    }
}
