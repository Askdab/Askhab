package com.company;

import java.io.IOException;

public class Main {

        public static void main (String[] args) throws IOException {
            //№1
            Circle c1 = new Circle();
            System.out.println("Длина радиуса " + c1.r + " = " + c1.lengthCircle());

            //№2
            c1.randomCentreCircle();
            System.out.println();
            System.out.println("Новый радиус:" + c1.x + c1.y);

            //№3
            System.out.println();
            Circle c2 = new Circle();

            //№4
            System.out.println();
            System.out.println("Расстояние между центрами первой и второй окружностей = " + c1.distanceCircle(c2));

            //№5
            System.out.println();
            if (c1.touchingCircle(c2)) {
                System.out.println("Окружности соприкасаются");
            } else {
                System.out.println("окружности не соприкасаются");
            }
        }
    }
