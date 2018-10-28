package com.java4web;

import java.io.*;

public class IOEx1 {
    public static void main(String[] args) {
        try (InputStreamReader reader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            System.out.println("Write a message:");
            String message = bufferedReader.readLine();
            System.out.println("This is your message: " + message);
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
