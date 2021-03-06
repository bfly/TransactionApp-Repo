package edu.dcccd.lesson12.services;

import edu.dcccd.lesson12.entity.Transaction;

import java.util.List;
import java.util.Optional;

public interface TransactionService
{
    String createTransaction(Transaction transaction);
    void updateTransaction(String id,Transaction transaction) throws Exception;
    void deleteTransaction(Transaction transaction);
    void deleteTransactionById(Long id);
    Iterable<Transaction> getAllTransaction();
    List<Transaction> getTransactionByDay(String day);
    Optional<Transaction> getTransactionById( Long id);
}
