package com.company;

public class lab4_1 {
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

    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i=0; i<20; i++){
            array[i]=met(1,20);
            System.out.print(array[i]+" ");

        }

    }
}
