package com.java4web;

import java.util.Stack;

public class Exercise5 {

    public static void main(String[] args) {
        int a=854;
        Stack st = new Stack();
        while(a>0){
            st.push(a%10);
            a=a/10;
        }
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

    }
}
