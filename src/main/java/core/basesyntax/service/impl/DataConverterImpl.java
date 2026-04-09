package core.basesyntax.service.impl;

import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.DataConverter;

import java.util.List;


public class DataConverterImpl implements DataConverter {
    @Override
    public List<FruitTransaction> getTransactions(List<String> transactions) {
        return transactions.stream().map(s -> s.split(","))
                .filter(s -> s[0].equals("b") || s[0].equals("s") || s[0].equals("p") || s[0].equals("r"))
                .map(s -> new FruitTransaction(s[0], s[1], Integer.parseInt(s[2])))
                .toList();
    }
}
