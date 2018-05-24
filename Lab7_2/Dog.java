package com.company;

public class Dog extends Pet {
    public Dog(String name, int age, boolean hungry) {
        setName(name);
        setAge(age);
        setHungry(hungry);
    }

    public void voice() {
        System.out.println("Гав!");
    }
}
