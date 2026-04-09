package core.basesyntax.service.impl;

import core.basesyntax.db.StorageDao;
import core.basesyntax.service.ReportGenerator;

public class ReportGeneratorImpl implements ReportGenerator {
    private StorageDao dao;

    public ReportGeneratorImpl(StorageDao dao) {
        this.dao = dao;
    }

    @Override
    public String generateReport() {
        return dao.getData();
    }
}
