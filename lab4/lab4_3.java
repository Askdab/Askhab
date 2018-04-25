package com.company;

public class lab4_3 {
    public static void main(String[] args) {
        int[] a = {9, 5, 6, 2, 1, 3, 4, 7, 8, 0};

        System.out.println("Неотсортированный:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int e = a[i];
                    a[i] = a[j];
                    a[j] = e;
                }
            }
        }

        System.out.println("Отсортированный:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
