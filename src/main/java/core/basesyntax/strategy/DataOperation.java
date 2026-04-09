package core.basesyntax.strategy;

import core.basesyntax.model.FruitTransaction;

public interface DataOperation {
    void execute(FruitTransaction fruit);
}
