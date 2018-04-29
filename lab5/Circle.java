package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circle {

    public double x;
    public double y;
    public double r;

    public void Circle() {
        System.out.println("Центр окружности " + x + y + " и радиус " + r);
    }

    public void move(double a, double b) {
        x = x + a;
        y = y + b;
    }

    //№1

    public double lengthCircle() {
        //L = 2 * PI * r
        return 2 * Math.PI * this.r;
    }

    //№2
    public void randomCentreCircle() {
        x = (int) (Math.random() * 199) - 99;
        y = (int) (Math.random() * 199) - 99;
    }

    public void zoom(double k) {
        r = r * k;
    }

    //ЗАДАНИЕ №3
    public Circle() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите координаты центра и радиус окружности:");

        String x_str = in.readLine();
        String y_str = in.readLine();
        String r_str = in.readLine();

        try {
            x = Integer.parseInt(x_str);
            y = Integer.parseInt(y_str);
            r = Integer.parseInt(r_str);
        } catch (Exception e) {
            System.out.println("Ошибка");
            x = 0.0;
            y = 0.0;
            r = 1.0;
        }

        if (r < 0) {
            System.out.println("Радиус отрицательный. Ошибка");
            r = 1.0;
        }
    }

    //№4
    public double distanceCircle(Circle c) {

        double a = c.x - this.x;
        double b = c.y - this.y;

        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    //№5
    public boolean touchingCircle(Circle c) {

        double a = c.x - this.x;
        double b = c.y - this.y;

        //Расстояние
        double s = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        if (s == Math.abs(this.r - c.r) || s == this.r + c.r) {
            return true;
        } else {
            return false;
        }
    }
}
