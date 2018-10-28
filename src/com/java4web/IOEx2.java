package com.java4web;

import java.io.*;

public class IOEx2 {

    public static void main(String[] args)  {

        try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter out = new BufferedWriter(new FileWriter("ex2.txt"))) {

            System.out.println("Give a message to be written to ex2.txt: ");
            String l = in.readLine();
            out.write(l);
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
