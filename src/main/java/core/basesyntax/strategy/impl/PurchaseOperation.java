package core.basesyntax.strategy.impl;

import core.basesyntax.db.StorageDao;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.strategy.DataOperation;

public class PurchaseOperation implements DataOperation {
    StorageDao dao;
    public PurchaseOperation(StorageDao dao) {
        this.dao = dao;
    }
    @Override
    public void execute(FruitTransaction fruit) {
        dao.subtractionQuantity(fruit.getName(),  fruit.getQuantity());
    }
}
