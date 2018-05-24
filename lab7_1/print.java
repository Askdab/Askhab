package com.company;

public class print {
    static void print(int i) {
        System.out.println(i);
    }

    static void print(String s) {
        System.out.println(s);
    }

    static void print(Integer i) {
        System.out.println(i);
    }

    static void print(Double d) {
        System.out.println(d);
    }

    static void print(int[] mass) {
        String out = "";
        for (int i = 0; i < mass.length; i++) {
            out += mass[i] + " ";
        }
        System.out.println(out);
    }
}
