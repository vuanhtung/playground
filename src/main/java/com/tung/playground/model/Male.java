package com.tung.playground.model;

public class Male extends Person {

    private Female wife;

    public Male(String name, Male father, Female mother) {
        super(name, Gender.MALE, father, mother);
    }

    public Female getWife() {
        return wife;
    }

    public void setWife(Female wife) {
        this.wife = wife;
    }
}
