package com.company;

public class cat {
    public String name;
    public int childCount = 0;

    public cat(String name) {
        this.name = name;
    }

    public cat() {
        this.name = "Кошка родитель";
    }

    public cat getChild() {
        childCount++;
        String name = this.name + ": " + childCount + "ребенок";
        return (new cat(name));
    }
}
