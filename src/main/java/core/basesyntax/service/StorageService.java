package core.basesyntax.service;

import core.basesyntax.db.StorageDao;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.model.Operation;
import core.basesyntax.strategy.DataOperation;

import java.util.List;
import java.util.Map;

public interface StorageService {
    void update();
}
