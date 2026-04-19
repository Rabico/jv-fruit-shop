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

        if (!dao.checkFruit(fruit.getName())) {
            throw new RuntimeException("The fruit " + fruit.getName() + " is not exist");
        }
        dao.updateQuantity(fruit.getName(), fruit.getQuantity()
                + dao.actualQuantity(fruit.getName()));
    }
}
