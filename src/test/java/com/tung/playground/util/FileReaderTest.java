package com.tung.playground.util;

import org.junit.jupiter.api.Test;

import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileReaderTest {

    @Test
    void testReadLinesFromFile() {
        // given
        String filePath = Paths.get(System.getProperty("user.dir"),
                "src\\test\\resources", "test.txt").toString();

        // when
        List<String> actual = FileReader.readLinesFromFile(filePath);

        // then
        assertEquals(2, actual.size());
        assertEquals("abc", actual.get(0));
        assertEquals("def", actual.get(1));
    }
}
