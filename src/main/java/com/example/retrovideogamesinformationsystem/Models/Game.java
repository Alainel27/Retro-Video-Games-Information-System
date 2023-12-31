package com.example.retrovideogamesinformationsystem.Models;

import java.util.Objects;

public class Game {

    private String gameName = "";

    private String publisher = "";

    private String description = "";

    private String developer = "";

    private String type = "";

    private int yearOfRelease = 0000;

    private String cover = "";

    public Game(String gameName, String publisher, String description, String developer, String type, int yearOfRelease, String cover) {
        this.gameName = gameName;
        this.publisher = publisher;
        this.description = description;
        this.developer = developer;
        this.type = type;
        this.yearOfRelease = yearOfRelease;
        this.cover = cover;
    }

    public String getGameName() {
        return gameName;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getDescription() {
        return description;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getType() {
        return type;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCover() {
        return cover;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return yearOfRelease == game.yearOfRelease && Objects.equals(gameName, game.gameName) && Objects.equals(publisher, game.publisher) && Objects.equals(description, game.description) && Objects.equals(developer, game.developer) && Objects.equals(type, game.type) && Objects.equals(cover, game.cover);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameName, publisher, description, developer, type, yearOfRelease, cover);
    }

    public String toString() {
        return  '\n' +
                "Game Name= " + gameName +
                ", Publisher= " + publisher +
                ", Description= " + description +
                ", Developer= " + developer +
                ", Type= " + type +
                ", YearOfRelease= " + yearOfRelease +
                ", Cover= " + cover +
                '\n';
    }
}

