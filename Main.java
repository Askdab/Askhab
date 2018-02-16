package com.company;

import java.util.Scanner;

        public class Main {

            public static void main(String[] args) {
                // 1 задача
                System.out.println("№1");
                for (int i = 0; i < 101; i++) {
                    if (i % 2 == 0)
                        System.out.print(i + " ");

                }
                System.out.println(" ");
                // 2 задача
                System.out.println("№2");

                Scanner num = new Scanner(System.in);
                int m;
                m = num.nextInt();
                int n;
                n = num.nextInt();
                System.out.println("m = " + m);
                System.out.println("n = " + n);
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("8");
                    }
                    System.out.println(" ");
                }
                System.out.println(" ");

                // 3 задача
                System.out.println("№3");
                for(int i=1;i<=10;i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("8");
                    }
                    System.out.println(" ");
                }
                // 4 задача
                System.out.println("№4");
                Scanner znach = new Scanner(System.in);
                int a;
                a = znach.nextInt();
                int b;
                b = znach.nextInt();
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                if (a > b){
                    System.out.println(b);
                }
                else System.out.println(a);
            }
        }

