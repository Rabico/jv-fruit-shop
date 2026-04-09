package core.basesyntax.service.impl;

import core.basesyntax.db.StorageDao;
import core.basesyntax.db.StorageDaoImpl;
import core.basesyntax.service.ReportGenerator;

public class ReportGeneratorImpl implements ReportGenerator {
    StorageDao dao;
    public ReportGeneratorImpl(StorageDao dao){
        this.dao = dao;
    }
    @Override
    public String generateReport() {
        return dao.getData();
    }
}
