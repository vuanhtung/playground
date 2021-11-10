package com.tung.playground.model;

public abstract class Person {

    protected final String name;
    protected final Gender gender;
    protected final Male father;
    protected final Female mother;

    protected Person(String name, Gender gender, Male father, Female mother) {
        this.name = name;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Male getFather() {
        return father;
    }

    public Female getMother() {
        return mother;
    }
}
