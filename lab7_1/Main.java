package com.company;

public class Main {

    static void checkObject(Object o) {
        while (true) {
            if (o instanceof cat) {
                try {
                    o = (dog) o;
                    System.out.println("Собака");
                    break;
                } catch (Exception error) {
                    System.out.println("Кошка");
                    break;
                }
            }
            if (o instanceof bird) {
                System.out.println("Птица");
                break;
            }
            if (o instanceof lamp) {
                System.out.println("Лампа");
                break;
            }
            System.out.println("Неизвестный объект");
            break;
        }
    }

    public static void main(String[] args) {
        //Полиморфизм. №1
        whale whale = new whale();
        whale.printName();
        System.out.println();

        //Полиморфизм. №2
        dog dok = new dog();
        lamp lamb = new lamp();
        checkObject(dok);
        checkObject(lamb);
        System.out.println();

        //Полиморфизм. №3
        cat cad = new cat("Мурзик");
        dog dog1 = new dog("Шарик");
        cat catChild1 = cad.getChild();
        cat catChild2 = cad.getChild();
        dog dogChild = dog1.getChild();
        System.out.println(catChild1.name);
        System.out.println(catChild2.name);
        System.out.println(dogChild.name);
        System.out.println();

        //Перегрузка. №1
        int i = 5;
        String s = "Это строка";
        print.print(i);
        print.print(s);
        System.out.println();

        //Перегрузка. №2
        Integer in = 4;
        print.print(in);
        System.out.println();

        //Перегрузка. №3
        Double d = 3.14;
        print.print(d);
        int[] mass = new int[]{1, 2, 3, 4, 5};
        print.print(mass);
        System.out.println();

        //Перегрузка. №4
        int i1 = 2, i2 = 3;
        long l1 = 4, l2 = 5;
        double d1 = 2.25, d2 = 15.41;
        System.out.println(minmax.min(i1, i2));
        System.out.println(minmax.min(l1, l2));
        System.out.println(minmax.min(d1,d2));
        System.out.println();

        //Перегрузка. №5
        System.out.println(minmax.max(i1,i2));
        System.out.println(minmax.max(l1,l2));
        System.out.println(minmax.max(d1,d2));
        System.out.println();

    }
}
