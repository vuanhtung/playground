package com.tung.playground.model;

import java.util.List;

public class Female extends Person {

    private Male husband;
    private List<Person> children;

    public Female(String name, Male father, Female mother) {
        super(name, Gender.FEMALE, father, mother);
    }

    public Male getHusband() {
        return husband;
    }

    public void setHusband(Male husband) {
        this.husband = husband;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }
}
