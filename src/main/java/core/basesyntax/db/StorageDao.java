package core.basesyntax.db;

import core.basesyntax.model.FruitTransaction;

public interface StorageDao {
    void add(FruitTransaction fruit);
    void addQuantity(String fruitName, int quantity);
    void subtractionQuantity(String fruitName, int quantity);
    String getData();
}
