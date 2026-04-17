package core.basesyntax.strategy.impl;

import core.basesyntax.db.StorageDao;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.strategy.DataOperation;

public class BalanceOperation implements DataOperation {
    private StorageDao dao;

    public BalanceOperation(StorageDao dao) {
        this.dao = dao;
    }

    @Override
    public void execute(FruitTransaction fruit) {

        dao.add(fruit);
    }
}
