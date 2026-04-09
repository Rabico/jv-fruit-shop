package core.basesyntax.service.impl;

import core.basesyntax.service.FileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReaderImpl implements FileReader {
    @Override
    public List<String> readFile(String fileName) {
        List<String> list = new ArrayList<>();
        Path filePath = Paths.get(fileName);
        try {
            list = Files.readAllLines(filePath);
        } catch (IOException e) {
            throw new RuntimeException("Can't read from file", e);
        }
        return list;
    }
}
