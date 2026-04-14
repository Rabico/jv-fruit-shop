package core.basesyntax.db;

import core.basesyntax.model.FruitTransaction;
import java.util.Map;

public interface StorageDao {

    void add(FruitTransaction fruit);

    void addQuantity(String fruitName, int quantity);

    void subtractQuantity(String fruitName, int quantity);

    Map<String, Integer> getData();
}
