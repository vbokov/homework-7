package com.epam.at.vitaliy_bokov.hw7.data;

/**
 * Created by vbokov on 3/1/2015.
 */
public class Preferences {
    protected String transport;
    protected String meals;
    protected int term;

    public Preferences(String transport, String meals, int term) {
        super();
        this.transport = transport;
        this.meals = meals;
        this.term = term;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getMeals() {
        return meals;
    }

    public void setMeals(String meals) {
        this.meals = meals;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

}



