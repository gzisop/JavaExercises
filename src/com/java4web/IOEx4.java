package com.java4web;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IOEx4 {

    public static void main(String[] args) {

        Path path = Paths.get("C:\\Users\\georg\\IdeaProjects\\JavaExcercises\\ex2.txt");
        if (Files.exists(path)){
            System.out.println("The File exists!");
        }
        else System.out.println("The file doesn't exist!");

    }
}

