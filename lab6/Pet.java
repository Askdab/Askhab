package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public abstract class Pet {
        private int weight;
        private String gender;
        private int age;

        public String Gender() {
            return this.gender;
        }

        public int Weight() {
            return this.weight;
        }

        public int Age() {
            return this.age;
        }

        public void setGender(String g) {
            gender = g;
        }

        public void setWeight(int w) {
            weight = w;
        }

        public void setAge(int a) {
            age = a;
        }

        public abstract void createPet() throws IOException;
    }

    class Cat extends Pet {
        private String name;

    public Cat() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите имя кошки: ");

            try {
                name = in.readLine();
                System.out.println();
                break;
            } catch (Exception error) {
                System.out.println("Ошибка");
            }
        }
    }

    public void info() {
        System.out.println("Данные о коте: вес " + Weight() + ", пол " + Gender() + ", возраст " + Age() +
                ", имя " + name + "\n");
    }

    public void createPet() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Вес, пол и возраст кошки: ");

            try {
                setWeight(Integer.parseInt(in.readLine()));
                setGender(in.readLine());

                switch (Gender()) {
                    case "М":
                    case "м":
                    case "Ж":
                    case "ж":
                        break;
                    default:
                        System.out.println("Ошибка: пол вводится одной буквой!\n");
                        continue;
                }

                setAge(Integer.parseInt(in.readLine()));
                System.out.println();
                break;
            } catch (Exception error) {
                System.out.println("Непредвиденная ошибка\n");
            }
        }
    }
}

    class Dog extends Pet {
      private String name;

    public Dog() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Введите имя собаки:");

            try {
                name = in.readLine();
                System.out.println();
                break;
            } catch (Exception error) {
                System.out.println("Непредвиденная ошибка, попробуйте еще раз\n");
            }
        }
    }

    public void getStat() {
        System.out.println("Данные о собаке: вес " + Weight() + ", пол " + Gender() + ", возраст " + Age() +
                ", имя " + name + "\n");
    }

    public void createPet() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            System.out.println("Вес, пол и возраст собаки: ");

            try {
                setWeight(Integer.parseInt(in.readLine()));
                setGender(in.readLine());

                switch (Gender()) {
                    case "М":
                    case "м":
                    case "Ж":
                    case "ж":
                        break;
                    default:
                        System.out.println("Введит пол одной буквой");
                        continue;
                }

                setAge(Integer.parseInt(in.readLine()));
                System.out.println();
                break;
            } catch (Exception error) {
                System.out.println("Ошибка");
            }
        }
    }
}
