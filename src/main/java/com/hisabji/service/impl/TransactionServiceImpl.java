/**
 * 
 */
package com.hisabji.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hisabji.model.Transactions;
import com.hisabji.repository.TransactionRepository;
import com.hisabji.service.TransactionService;

/**
 * @author subhash
 *
 */
@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	private TransactionRepository transactionRepository;

	/**
	 * @param transactionRepository
	 */
	public TransactionServiceImpl(TransactionRepository transactionRepository) {
		super();
		this.transactionRepository = transactionRepository;
	}
	
	@Override
	public Transactions saveTransactions(Transactions transactions) {
		return transactionRepository.save(transactions);
	}
	
	@Override
	public List<Transactions> getAllTransactions() {
		return transactionRepository.findAll();
	}
	
	@Override
	public Transactions getTransactionById(long id) {
		return transactionRepository.findById(id).get();			
	}
	
	@Override
	public Transactions updateTransaction(Transactions transactions, long id) {
		Transactions existingTransaction = transactionRepository.findById(id).get();
		
		existingTransaction.setAmount(transactions.getAmount());
		existingTransaction.setCurrency(transactions.getCurrency());
		existingTransaction.setDescription(transactions.getDescription());
		existingTransaction.setMerchant(transactions.getMerchant());
		existingTransaction.setAccount_from(transactions.getAccount_from());
		existingTransaction.setAccount_to(transactions.getAccount_to());
		existingTransaction.setTags(transactions.getTags());
		existingTransaction.setTransaction_time(transactions.getTransaction_time());
		existingTransaction.setLast_updated_transaction(transactions.getLast_updated_transaction());
		transactionRepository.save(existingTransaction);
		return existingTransaction;
		
	}
	
	@Override
	public void deleteTransaction(long id) {
		transactionRepository.findById(id).get();
		transactionRepository.deleteById(id);
	}
}
