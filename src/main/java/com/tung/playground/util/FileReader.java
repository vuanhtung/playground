package com.tung.playground.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public final class FileReader {

    private FileReader() {
    }

    public static List<String> readLinesFromFile(String filePath) {
        try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
            return lines.collect(toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
