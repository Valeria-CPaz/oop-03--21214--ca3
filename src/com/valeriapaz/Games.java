package com.valeriapaz;

// Feature: Abstract class
abstract class Games {

    public String name;
    public String studio;
    public int yearReleased;
    public boolean haveIPlayed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    public boolean isHaveIPlayed() {
        return haveIPlayed;
    }

    public void setHaveIPlayed(boolean haveIPlayed) {
        this.haveIPlayed = haveIPlayed;
    }

    // Feature: toString
    @Override
    public String toString() {
        return "Games{" +
                "name='" + name + '\'' +
                ", studio='" + studio + '\'' +
                ", yearReleased=" + yearReleased +
                ", haveIPlayed=" + haveIPlayed +
                '}';
    }
}
