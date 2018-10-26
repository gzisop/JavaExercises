package com.java4web;

public class Exercise7 {

    public static void main(String[] args) {
        int[] f = new int[30];
        f[0]=1;
        f[1]=1;
        System.out.print("The first 30 numbers of Fibonacci series are: 1 1 " );
        for(int i=2;i<30;i++){
            f[i]=f[i-1]+f[i-2];
            System.out.print(f[i] + " ");
        }
    }
}
