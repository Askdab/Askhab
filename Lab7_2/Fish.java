package com.company;

public class Fish extends Pet {
    public Fish(String name, int age, boolean hungry) {
        setName(name);
        setAge(age);
        setHungry(hungry);
    }

    public void voice() {
        System.out.println("Буль-буль!");
    }
}
