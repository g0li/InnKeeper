package com.lilliemountain.innkeeper;

public class Hotels {
    String name,rate;
    float rating;

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public Hotels(String name, String rate, float rating, int place) {

        this.name = name;
        this.rate = rate;
        this.rating = rating;
        this.place = place;
    }

    int place;

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
