package edu.dcccd.lesson11.services;

import edu.dcccd.lesson11.entity.Transaction;

import java.util.List;

public interface TransactionService {
    void createTransaction(Transaction transaction);
    List<Transaction> getAllTransaction();
}
