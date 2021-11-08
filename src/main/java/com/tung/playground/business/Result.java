package com.tung.playground.business;

import java.util.Collections;
import java.util.List;

public class Result {

    private final ResultCode resultCode;
    private final List<String> values;

    public Result(ResultCode resultCode) {
        this.resultCode = resultCode;
        this.values = null;
    }

    public Result(List<String> values) {
        this.resultCode = null;
        this.values = Collections.unmodifiableList(values);
    }

    public ResultCode getResultCode() {
        return resultCode;
    }

    public List<String> getValues() {
        return values;
    }
}
