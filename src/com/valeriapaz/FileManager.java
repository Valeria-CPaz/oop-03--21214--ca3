package com.valeriapaz;

import java.io.FileNotFoundException;
import java.text.Normalizer;
import java.util.Formatter;

public class FileManager extends Games implements File {

    private static Formatter output;
    private static String fileName = "gameTracker.txt";

    public FileManager(String name, String studio, int yearReleased, boolean haveIPlayed) {
        this.name = name;
        this.studio = studio;
        this.yearReleased = yearReleased;
        this.haveIPlayed = haveIPlayed;

    }

    @Override
    public void createTextFile(String _fileName) {
        fileName = _fileName;
        openFile();
        addGame();
        closeFile();

    }

    private void readGames() {

    }


    @Override
    public void addGame() {
        output.format("Name: %s | Studio: %s | Year Released: %s | Played: %b %n", name, studio, yearReleased, haveIPlayed);
    }


    @Override
    public void openFile() {

        // Feature: Use of Exception
        try {
            output = new Formatter(fileName);
        } catch (SecurityException securityException) {
            System.out.println("permission denied");
            System.exit(1);

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("error opening file");
            System.exit(1);
        }

    }

    @Override
    public void closeFile() {

        if (output != null) {
            output.close();
        }

    }

    @Override
    public void readFile(String _fileName) {
        fileName = _fileName;
        openFile();
        readGames();
        closeFile();
    }


}
