package com.example.retrovideogamesinformationsystem.Models;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GamesMachine that = (GamesMachine) o;
        return yearOfLaunch == that.yearOfLaunch && Double.compare(that.price, price) == 0 && Objects.equals(machineName, that.machineName) && Objects.equals(manufacturer, that.manufacturer) && Objects.equals(type, that.type) && Objects.equals(media, that.media) && Objects.equals(url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(machineName, manufacturer, type, media, yearOfLaunch, price, url);
    }

    public String toString() {
        return
                "Game Machine= " + machineName +
                ", Manufacturer= " + manufacturer +
                ", Type= " + type +
                ", Media= " + media +
                ", Launched= " + yearOfLaunch +
                ", Price= " + price +
                ", URL= " + url +
                '\n';
    }
}



