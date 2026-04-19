package core.basesyntax.service.impl;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.model.Operation;
import core.basesyntax.service.StorageService;
import core.basesyntax.strategy.DataOperation;
import java.util.List;
import java.util.Map;

public class StorageServiceImpl implements StorageService {
    private Map<Operation, DataOperation> operations;

    public StorageServiceImpl(Map<Operation, DataOperation> operations) {
        this.operations = operations;
    }

    @Override
    public void update(List<FruitTransaction> fruitTransactions) {
        for (FruitTransaction fruitTransaction : fruitTransactions) {
            operations.get(fruitTransaction.getOperation()).execute(fruitTransaction);
        }
    }
}
