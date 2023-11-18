package com.example.retrovideogamesinformationsystem.Models;

public class GamesMachine {

    private String machineName = "";

    private String manufacturer = "";

    private String type = "";

    private String media = "";

    private int yearOfLaunch = 1900;

    private double price = 00.00;

    private String url = "";

    public GamesMachine(String machineName, String manufacturer, String type, String media, int yearOfLaunch, double price, String url) {
        this.machineName = machineName;
        this.manufacturer = manufacturer;
        this.type = type;
        this.media = media;
        this.yearOfLaunch = yearOfLaunch;
        this.price = price;
        this.url = url;
    }

    public String getMachineName() {
        return machineName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }

    public String getMedia() {
        return media;
    }

    public int getYearOfLaunch() {
        return yearOfLaunch;
    }

    public double getPrice() {
        return price;
    }

    public String getUrl() {
        return url;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public void setYearOfLaunch(int yearOfLaunch) {
        this.yearOfLaunch = yearOfLaunch;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    public String toString() {
        return "GamesMachine{" +
                "machineName='" + machineName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                ", media='" + media + '\'' +
                ", yearOfLaunch=" + yearOfLaunch +
                ", price=" + price +
                ", url='" + url + '\'' +
                '}';
    }
}



