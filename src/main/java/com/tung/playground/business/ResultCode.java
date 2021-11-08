package com.tung.playground.business;

import java.util.List;

public enum ResultCode {
    CHILD_ADDED,
    PERSON_NOT_FOUND,
    CHILD_ADDITION_FAILED,
    NONE,
    CUSTOM;

    private List<String> values;

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }
}
