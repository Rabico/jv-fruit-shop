package core.basesyntax.db;

import core.basesyntax.model.FruitTransaction;
import java.util.HashMap;
import java.util.Map;

public class StorageDaoImpl implements StorageDao {
    private static Map<String, Integer> fruits = new HashMap<String, Integer>();

    @Override
    public void add(FruitTransaction fruit) {
        fruits.put(fruit.getName(), fruit.getQuantity());
    }

    @Override
    public void addQuantity(String fruitName, int quantity) {
        checkFruit(fruitName);
        fruits.put(fruitName, fruits.getOrDefault(fruitName, 0) + quantity);
    }

    @Override
    public void subtractQuantity(String fruitName, int quantity) {
        checkFruit(fruitName);
        fruits.put(fruitName, fruits.getOrDefault(fruitName, 0) - quantity);
    }

    @Override
    public Map<String, Integer> getData() {

        return fruits;
    }

    private void checkFruit(String fruitName) {
        if (!fruits.containsKey(fruitName)) {
            throw new RuntimeException("The fruit " + fruitName + " is not exist");
        }
    }
}
