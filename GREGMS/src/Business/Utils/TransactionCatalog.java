/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 *
 * @author Mukul
 */
public class TransactionCatalog {
    private Map<UUID, Transaction> transactionMap;

    public TransactionCatalog() {
        transactionMap = new HashMap<>();
    }

    public Transaction recordTransaction(UUID offerId, double amountSold, double transactionPrice, String energySource, UUID pid) {
        Transaction transaction = new Transaction(offerId, amountSold, transactionPrice, energySource, pid);
        transactionMap.put(transaction.getTransactionId(), transaction);
        return transaction;
    }

    public List<Transaction> getAllTransactions() {
        return new ArrayList<>(transactionMap.values());
    }

    public Map<UUID, Transaction> getTransactionMap() {
        return transactionMap;
    }

    public void setTransactionMap(Map<UUID, Transaction> transactionMap) {
        this.transactionMap = transactionMap;
    }
   
}