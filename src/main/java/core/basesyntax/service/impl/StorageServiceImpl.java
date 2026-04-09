package core.basesyntax.service.impl;

import core.basesyntax.db.StorageDao;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.model.Operation;
import core.basesyntax.service.StorageService;
import core.basesyntax.strategy.DataOperation;

import java.util.List;
import java.util.Map;

public class StorageServiceImpl implements StorageService {
    private List<FruitTransaction> fruitTransactions;
    Map<Operation, DataOperation> operations;
    public StorageServiceImpl(List<FruitTransaction> fruitTransactions, Map<Operation, DataOperation> operations) {
        this.fruitTransactions = fruitTransactions;
        this.operations = operations;
    }
    @Override
    public void update() {
        for (FruitTransaction fruitTransaction : fruitTransactions) {
            operations.get(fruitTransaction.getOperation()).execute(fruitTransaction);
        }
    }
}
