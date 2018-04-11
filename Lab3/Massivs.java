package com.company;
import java.util.Random;

public class Massivs {

    public void massiv1() {
        int[] chet = new int[10];
        int a = 0;
        int b = 0;
        for (int i = 0; i < 10; i++) {
            chet[i] = a;
            a += 2;
            System.out.print(a + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < 10; i++) {
            chet[i] = a;
            b += 2;
            System.out.println(+b);
        }


    }

    public void massiv2() {
        int[] arr = new int[50];
        int a = 0;
        for (int i = 0; i < 100; i++) {
            arr[a] = i;
            if (i % 2 == 1) {
                System.out.print(arr[a] + " ");
            }
        }
        System.out.println(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public void massiv3() {
        int a = 0;
        int[] mass = new int[15];
        for (int i = 0; i < 15; i++) {
            Random rand = new Random();
            mass[i] = rand.nextInt(10);
            System.out.print(mass[i] +" ");
            if (mass[i]%2 == 0) {a++;}
        }
        System.out.print("Количество четных: " + a);
        System.out.println(" ");

    }
    public void massiv4(){
        int[][] mass = new int[8][5];
        Random rand = new Random();
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 5; j++){
                mass[i][j] = rand.nextInt(90)+10;
                System.out.print(mass[i][j]+ " ");
            }
            System.out.println(" ");
        }

            }
    public void massiv5(){
        int[][] mass = new int[7][4];
        int modul = 0;
        int ind = 1;
        for (int i = 0; i < 7; i++) {
            int modul_i = 1;
            for (int j = 0; j < 4; j++) {
                mass[i][j] = (int) (Math.random() * 11) - 5;
                modul_i *= mass[i][j];
                System.out.format("%+-3d ", mass[i][j]);
            }
            if (Math.abs(modul_i) > modul) {
                modul = modul_i;
                ind = i + 1;
            }
            System.out.println();
    }
        System.out.println("Индекс строки с наибольшим по модулю произведению элементов: " + ind);
    }}
