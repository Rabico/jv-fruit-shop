package core.basesyntax.service.impl;

import core.basesyntax.service.FileWriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriterImpl implements FileWriter {
    PrintWriter writer;
    @Override
    public void writeReport(String report) {
        try {
            writer = new PrintWriter("Report.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        writer.println(report);
        writer.close();
    }
}
