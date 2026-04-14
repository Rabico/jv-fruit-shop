package core.basesyntax.service.impl;

import core.basesyntax.service.FileWriter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriterImpl implements FileWriter {
    private PrintWriter writer;

    @Override
    public void writeReport(String report, String fileName) {
        try (PrintWriter writer = new PrintWriter(fileName)) {
            writer.println(report);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Can't create or write to file", e);
        }

    }
}
