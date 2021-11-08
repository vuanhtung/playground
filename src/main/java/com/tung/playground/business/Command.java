package com.tung.playground.business;

public abstract class Command {

    protected final String keyword;

    protected Command(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    public abstract Result execute();
}
