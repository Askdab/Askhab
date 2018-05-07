package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Animal {
    private int power;

    public int getPower() {
        return power;
    }

    public Animal() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Силу");
                power = Integer.parseInt(in.readLine());
                System.out.println();
                break;
            } catch (Exception error) {
                System.out.println("Ошибка");
            }
        }
    }
}

class Fish extends Animal {
    private boolean eat;

    public Fish() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int check_fish;

        while (true) {
            try {
                System.out.println("Введите съедобность рыбы: 1 - съедобная, 0 - несъедобная:");
                check_fish = Integer.parseInt(in.readLine());
                if (check_fish == 0) {
                    eat = false;
                    System.out.println();
                    break;
                }
                if (check_fish == 1) {
                    eat = true;
                    System.out.println();
                    break;
                }
                System.out.println("Ошибка");
            } catch (Exception error) {
                System.out.println("Ошибка");
            }
        }
    }

    public boolean isEdibility() {
        return eat;
    }
}

class Ape extends Animal {
    private int age;

    public int getAge() {
        return age;
    }

    public Ape() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Введите возраст");
                age = Integer.parseInt(in.readLine());
                System.out.println();
                break;
            } catch (Exception error) {
                System.out.println("Ошибка");
            }
        }
    }
}

class Human extends Ape {
    public Human() {
    }

    public void interaction(Fish fish) {
        if (fish.isEdibility()) {
            if (this.getPower() > fish.getPower()) {
                System.out.println("Рыба поймана");
            } else {
                System.out.println("Большевата");
            }
        } else {
            System.out.println("Нельзя есть");
        }
    }

    public void interaction(Animal animal) {
        if (this.getPower() > animal.getPower()) {
            System.out.println("Охота");
        } else {
            System.out.println("Опасно, нельзя добыть");
        }
    }

    public void interaction(Ape ape) {
        if (this.getPower() > ape.getPower()) {
            if (5 <= ape.getAge() && ape.getAge() <= 18) {
                System.out.println("Обучаема");
            } else {
                System.out.println("Необучаема");
            }
        } else {
            System.out.println("Невоможно обучение");
        }
    }
}
