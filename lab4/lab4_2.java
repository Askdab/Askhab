package com.company;

public class lab4_2 {
    public static int met(int a,int b){
        if(a>b){
            int c=(int)(Math.random()*(a-b+1))+b;
            return c;
        }
        else {
            int c=(int)(Math.random()*(b-a+1))+a;
            return c;
        }
    }

    public static void arr(int[] array) {
        for(int i=0; i<10; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] array1 = new int[10];
        for (int i=0; i<10; i++){
            array1[i]=met(1,20);}
        arr(array1);
        System.out.println();


        int[] array2 = new int[10];
        for (int i=0; i<10; i++){
            array2[i]=met(1,20);}
        arr(array2);
        System.out.println();


        int[] array3 = new int[10];
        for (int i=0; i<10; i++){
            array3[i]=met(1,20);}
        arr(array3);
        System.out.println();


        int[] array4 = new int[10];
        for (int i=0; i<10; i++){
            array4[i]=met(1,20);}
        arr(array4);
        System.out.println();;

        int[] array5 = new int[10];
        for (int i=0; i<10; i++){
            array5[i]=met(1,20);}
        arr(array5);
        System.out.println();
    }
}
