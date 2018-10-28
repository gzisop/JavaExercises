package com.java4web;

import java.io.*;

public class IOEx5 {

    public static void main(String[] args) {

        File source = new File("ex3.txt");
        File dest = new File("copiedex3.txt");
        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream(source));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(dest))){

            byte[] buffer = new byte[1024];
            int chunkLength;
            while((chunkLength = in.read(buffer)) != -1){
                out.write(buffer,0,chunkLength);
                out.flush();
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
