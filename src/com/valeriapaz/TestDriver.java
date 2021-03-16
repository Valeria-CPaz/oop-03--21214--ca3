package com.valeriapaz;

public class TestDriver {

    public static void run() {

        FileManager game1 = new FileManager("The Witcher 3", "Project Red", 2015, true);
        FileManager game2 = new FileManager("The Last of Us Part 2", "Naughty Dog", 2020, true);

        game1.createTextFile("gameTracker.txt");

    }
}
