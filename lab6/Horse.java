package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Horse {
    private String name;

    public Horse() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Введите имя лошади:");
                name = in.readLine();
                System.out.println();
                break;
            } catch (Exception error) {
                System.out.println("Ошибка");
            } } }

    public String Name() {
        return this.name;
    }
}
    class Pegas extends Horse {
        public Pegas() throws IOException {
    }
        public void fly() {
         if (this.Name().contains("пегас") || this.Name().contains("Пегас")) {
                System.out.println("Fly");
        }   else {
             System.out.println("Not fly");
        } } }
