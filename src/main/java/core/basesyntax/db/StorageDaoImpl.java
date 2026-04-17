package core.basesyntax.db;

import core.basesyntax.model.FruitTransaction;
import java.util.HashMap;
import java.util.Map;

public class StorageDaoImpl implements StorageDao {
    private static Map<String, Integer> fruits = new HashMap<String, Integer>();

    @Override
    public void add(FruitTransaction fruit) {
        if (fruits.containsKey(fruit.getName())) {
            throw new IllegalArgumentException("Fruit already exists");
        }
        fruits.put(fruit.getName(), fruit.getQuantity());
    }

    @Override
    public int actualQuantity(String fruitName) {
        checkFruit(fruitName);
        return fruits.get(fruitName);
    }

    @Override
    public void updateQuantity(String fruitName, int quantity) {
        checkFruit(fruitName);
        fruits.put(fruitName, quantity);
    }

    @Override
    public Map<String, Integer> getData() {

        return new HashMap<>(fruits);
    }

    private void checkFruit(String fruitName) {
        if (!fruits.containsKey(fruitName)) {
            throw new RuntimeException("The fruit " + fruitName + " is not exist");
        }
    }
}
