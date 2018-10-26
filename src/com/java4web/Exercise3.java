package com.java4web;

public class Exercise3 {

    public static void main(String[] args) {
        float fraction=0;
        float sum=0;
        for (float i=1;i<11;i++){
            fraction=1/i;
            sum+=fraction;
        }
        System.out.println(sum);
    }
}
