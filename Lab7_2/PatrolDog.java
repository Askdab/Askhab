package com.company;

public class PatrolDog extends Pet {
    public PatrolDog(String name, int age, boolean hungry) {
        setName(name);
        setAge(age);
        setHungry(hungry);
    }

    public void voice() {
        System.out.println("Гав-гав-гав!");
    }
}
