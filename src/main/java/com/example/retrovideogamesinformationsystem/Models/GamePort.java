package com.example.retrovideogamesinformationsystem.Models;

public class GamePort {

    private String portedGame = "";

    private String portDeveloper = "";

    private int portReleaseYear = 1900;

    private String cover = "";

    public GamePort(String portedGame, String portDeveloper, int portReleaseYear, String cover) {
        this.portedGame = portedGame;
        this.portDeveloper = portDeveloper;
        this.portReleaseYear = portReleaseYear;
        this.cover = cover;
    }

    public String getPortedGame() {
        return portedGame;
    }

    public String getPortDeveloper() {
        return portDeveloper;
    }

    public int getPortReleaseYear() {
        return portReleaseYear;
    }

    public String getCover() {
        return cover;
    }

    public void setPortedGame(String portedGame) {
        this.portedGame = portedGame;
    }

    public void setPortDeveloper(String portDeveloper) {
        this.portDeveloper = portDeveloper;
    }

    public void setPortReleaseYear(int portReleaseYear) {
        this.portReleaseYear = portReleaseYear;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "GamePort{" +
                "portedGame='" + portedGame + '\'' +
                ", portDeveloper='" + portDeveloper + '\'' +
                ", portReleaseYear=" + portReleaseYear +
                ", cover='" + cover + '\'' +
                '}';
    }
}
