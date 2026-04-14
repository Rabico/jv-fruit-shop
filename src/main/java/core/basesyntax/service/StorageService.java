package core.basesyntax.service;

import core.basesyntax.model.FruitTransaction;
import java.util.List;

public interface StorageService {
    void update(List<FruitTransaction> fruitTransactions);
}
