package core.basesyntax.db;

import core.basesyntax.model.FruitTransaction;

public class StorageDaoImpl implements StorageDao {
    @Override
    public void add(FruitTransaction fruit) {
        Storage.fruits.put(fruit.getName(), fruit.getQuantity());
    }

    @Override
    public void addQuantity(String fruitName, int quantity) {
        Storage.fruits.put(fruitName, Storage.fruits.get(fruitName) + quantity);
    }

    @Override
    public void subtractionQuantity(String fruitName, int quantity) {
        Storage.fruits.put(fruitName, Storage.fruits.get(fruitName) - quantity);
    }

    @Override
    public String getData() {
        StringBuilder builder = new StringBuilder();
        for (String key : Storage.fruits.keySet()) {
            builder.append(key)
                    .append(" ")
                    .append(Storage.fruits.get(key))
                    .append("\n");
        }
        return builder.toString();
    }
}
