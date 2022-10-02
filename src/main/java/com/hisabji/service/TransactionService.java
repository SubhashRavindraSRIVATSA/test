/**
 * 
 */
package com.hisabji.service;

import java.util.List;

import com.hisabji.model.Transactions;

/**
 * @author subhash
 *
 */
public interface TransactionService {
	Transactions saveTransactions(Transactions transactions);
	List<Transactions> getAllTransactions();
	Transactions getTransactionById(long id);
	Transactions updateTransaction(Transactions transactions, long id);
	void deleteTransaction(long id);
}
