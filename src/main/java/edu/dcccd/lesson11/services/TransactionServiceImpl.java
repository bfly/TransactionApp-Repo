package edu.dcccd.lesson11.services;

import edu.dcccd.lesson11.entity.Transaction;
import edu.dcccd.lesson11.repository.SingletonTransaction;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TransactionServiceImpl implements TransactionService {

    @Override
    public void createTransaction(Transaction transaction) {
        SingletonTransaction.getInstance().transactions.add(transaction);
    }

    @Override
    public List<Transaction> getAllTransaction() {
        return SingletonTransaction.getInstance().transactions;

    }
}
