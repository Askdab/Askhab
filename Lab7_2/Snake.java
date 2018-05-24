package com.company;

public class Snake extends Pet {
    public Snake(String name, int age, boolean hungry) {
        setName(name);
        setAge(age);
        setHungry(hungry);
    }

    public void voice() {
        System.out.println("Тсс-ц-ц!");
    }
}
