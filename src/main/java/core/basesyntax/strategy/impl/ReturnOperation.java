package core.basesyntax.strategy.impl;

import core.basesyntax.db.StorageDao;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.strategy.DataOperation;

public class ReturnOperation implements DataOperation {
    private StorageDao dao;

    public ReturnOperation(StorageDao dao) {
        this.dao = dao;
    }

    @Override
    public void execute(FruitTransaction fruit) {
        dao.subtractQuantity(fruit.getName(), fruit.getQuantity());
    }
}
