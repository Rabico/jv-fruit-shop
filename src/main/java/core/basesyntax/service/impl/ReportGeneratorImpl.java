package core.basesyntax.service.impl;

import core.basesyntax.db.StorageDao;
import core.basesyntax.service.ReportGenerator;

import java.util.Map;

public class ReportGeneratorImpl implements ReportGenerator {
    private StorageDao dao;

    public ReportGeneratorImpl(StorageDao dao) {
        this.dao = dao;
    }

    @Override
    public String generateReport() {
        Map<String, Integer> fruits = dao.getData();
        StringBuilder builder = new StringBuilder();
        builder.append("fruit,quantity")
            .append(System.lineSeparator());
        for (String key : fruits.keySet()) {
            builder.append(key)
                    .append(",")
                    .append(fruits.get(key))
                    .append(System.lineSeparator());
        }
        return builder.toString();
    }
}
