package core.basesyntax;

import core.basesyntax.db.StorageDao;
import core.basesyntax.db.StorageDaoImpl;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.model.Operation;
import core.basesyntax.service.*;
import core.basesyntax.service.impl.*;
import core.basesyntax.strategy.DataOperation;
import core.basesyntax.strategy.impl.BalanceOperation;
import core.basesyntax.strategy.impl.PurchaseOperation;
import core.basesyntax.strategy.impl.ReturnOperation;
import core.basesyntax.strategy.impl.SupplyOperation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {
    public static void main(String[] args) {
       // 1.Reading data from CSV file
        FileReader fileReader = new FileReaderImpl();
        List<String> transactionList = fileReader.readFile("Data.csv");
        // 2. Convert data from String List to Fruit Transaction List
        DataConverter dataConverter = new DataConverterImpl();
        List<FruitTransaction> fruitTransactions = dataConverter.getTransactions(transactionList);
        // 3. Update the Storage according to transactions
        Map<Operation, DataOperation> operations = new HashMap<>();
        StorageDao dao = new StorageDaoImpl();
        operations.put(Operation.BALANCE, new BalanceOperation(dao));
        operations.put(Operation.PURCHASE, new PurchaseOperation(dao));
        operations.put(Operation.RETURN, new ReturnOperation(dao));
        operations.put(Operation.SUPPLY, new SupplyOperation(dao));
        StorageService storageService = new StorageServiceImpl(fruitTransactions, operations);
        storageService.update();
        // 4. Generate report
        ReportGenerator generator = new ReportGeneratorImpl(dao);
        String report = generator.generateReport();
        // 5. Save report to file
        FileWriter  fileWriter = new FileWriterImpl();
        fileWriter.writeReport(report);
    }

}
