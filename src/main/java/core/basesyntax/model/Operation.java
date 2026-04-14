package core.basesyntax.model;

public enum Operation {
    BALANCE("b"),
    SUPPLY("s"),
    PURCHASE("p"),
    RETURN("r");

    private final String code;
    Operation(String value) {
        this.code = value;
    }

}
