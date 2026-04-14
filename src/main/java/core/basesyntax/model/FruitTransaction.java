package core.basesyntax.model;

public class FruitTransaction {
    private String name;
    private int quantity;
    private Operation operation;

    public FruitTransaction(String operation, String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        this.operation = Operation.valueOf(operation);
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Operation getOperation() {
        return operation;
    }
}
