package core.basesyntax.strategy.impl;

import core.basesyntax.db.StorageDao;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.strategy.DataOperation;

public class SupplyOperation implements DataOperation {
    private StorageDao dao;

    public SupplyOperation(StorageDao dao) {
        this.dao = dao;
    }

    @Override
    public void execute(FruitTransaction fruit) {
        dao.addQuantity(fruit.getName(), fruit.getQuantity());
    }
}
