package com.lilliemountain.innkeeper;

public class Attractions {
    String name;
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

    public Attractions(String name, int place) {
        setName(name);
        setPlace(place);
    }
}
