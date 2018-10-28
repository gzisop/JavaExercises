package com.java4web;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOEx6 {

    public static void main(String[] args) {

        Path source = Paths.get("ex3.txt");
        Path dest = Paths.get("..");

        try {
            Files.copy(source, dest.resolve(source.getFileName()));
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
