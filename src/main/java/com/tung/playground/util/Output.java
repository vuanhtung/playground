package com.tung.playground.util;

import com.tung.playground.business.ResultCode;

public class Output {

    public void println(String value) {
        System.out.println(value);
    }

    public void println(ResultCode resultCode) {
        System.out.println(resultCode.name());
    }
}
