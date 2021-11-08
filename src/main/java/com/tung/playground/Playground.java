package com.tung.playground;

import com.tung.playground.util.FileReader;
import com.tung.playground.util.Output;

public class Playground {

    private static final Output OUTPUT = new Output();

    public static void main(String[] args) {
        FileReader.readLinesFromFile(args[0]).forEach(OUTPUT::println);
    }
}
