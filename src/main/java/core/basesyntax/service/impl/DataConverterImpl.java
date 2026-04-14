package core.basesyntax.service.impl;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.DataConverter;
import java.util.List;

public class DataConverterImpl implements DataConverter {
    @Override
    public List<FruitTransaction> convertToTransaction(List<String> transactions) {
        return transactions.stream().map(s -> s.split(","))
                .map(s -> new FruitTransaction(s[0], s[1],
                        Integer.parseInt(s[2])))
                .toList();
    }

    private int parseInteger(String s) {

        int i = 0;
        try {
            i = Integer.parseInt(s);
        } catch (NumberFormatException ignored) {

        }
        return i;
    }

    private FruitTransaction parseTransaction(String[] s) {
        if (s.length != 2) {
            throw new IllegalArgumentException();
        }
        return new FruitTransaction(s[0], s[1],
                parseInteger(s[2]));

    }
}
