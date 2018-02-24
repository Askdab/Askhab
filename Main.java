package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1 задача
        System.out.println("Задача №1");
        Scanner name = new Scanner(System.in);
        String a, b;
        System.out.println("Введите два имени: ");
        a = name.nextLine();
        b = name.nextLine();
        if (a.equals(b)){
            System.out.println("Имена одинаковые, вот вам доллар $, купите себе индивидуальность.");
        } else if(a.length() == b.length()) {
            System.out.println("Колиечество символов в строке блаблабла");
        } else {System.out.println("Конец");}

        // 2 задача
        System.out.println("Задача №2");
        Scanner wop = new Scanner(System.in);
        int a, b, c, d;
// Now let me see you
        a = wop.nextInt();
        b = wop.nextInt();
        c = wop.nextInt();
        d = wop.nextInt();
        int tancuem = Math.min( a, b);
        int pod = Math.min(c, d);
        int minimal = Math.min(tancuem, pod);
        System.out.println("Наииимеееньшее из вами введеных чисел это iq Асхаба = " + minimal);

        // 3 задача
        System.out.println("Задача №3");
        Scanner coor = new Scanner(System.in);
        int x, y;
        System.out.println("Введите оси координат x и y и мы с помощью черной)00)0) магии покажем где лежит эта точка: ");
        x = coor.nextInt();
        y = coor.nextInt();
        if (x==0 || y==0){System.out.println("По условию, точка НЕ ЛЕЖИТ НА ОСИ АЛЕ");}
            if(x>0 && y >0) { System.out.println("I"); }
            else if (x<0 && y>0) { System.out.println ("II"); }
            else if (x<0 && y<0) { System.out.println ("III"); }
            else if (x>0 && y<0) { System.out.println ("IV"); }
            /*            ^
                          |
                          |
                  II      |      I
                          |
                          |
            ------------------------------>
                          |
                          |
                  III     |      VI
                          |
                          |


            */

}}
