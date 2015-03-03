package com.epam.at.vitaliy_bokov.hw7.data;

/**
 * Created by vbokov on 3/1/2015.
 */
public class Offer {
    protected String type;
    protected String place;
    protected int price;

    public Offer(String type, String place, int price) {
        super();
        this.type = type;
        this.place = place;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

}


