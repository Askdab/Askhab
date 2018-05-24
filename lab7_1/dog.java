package com.company;

public class dog extends cat {
    public dog(String name) {
        this.name = name;
    }

    public dog() {
        this.name = "Собака родитель";
    }

    public dog getChild() {
        childCount++;
        String name = this.name + ": " + childCount + "ребенок";
        return (new dog(name));
    }
}
