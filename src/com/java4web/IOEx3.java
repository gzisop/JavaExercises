package com.java4web;

import java.io.*;

public class IOEx3 {
    public static void main(String[] args)  {

        try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter out = new BufferedWriter(new FileWriter("ex3.txt"))) {
            for(int i=1;i<4;i++) {
                System.out.println("Give the #" + i + " line of your message to be written to ex3.txt: ");
                String l = in.readLine();
                out.write(l);
                out.newLine();
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
