/**
 * 
 */
package com.hisabji.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hisabji.model.Transactions;
import com.hisabji.service.TransactionService;

/**
 * @author subhash
 *
 */
@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
	
	private TransactionService transactionService;

	/**
	 * @param transactionService
	 */
	public TransactionController(TransactionService transactionService) {
		super();
		this.transactionService = transactionService;
	}
	
	@PostMapping
	public ResponseEntity<Transactions> saveTransactions(@RequestBody Transactions transactions){
		return new ResponseEntity<Transactions>(transactionService.saveTransactions(transactions), HttpStatus.CREATED);
	}
	
	@GetMapping("/all-transactions")
	public List<Transactions> getAllTransactions(){
		return transactionService.getAllTransactions();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Transactions> getTransactionById(@PathVariable("id") long id){
		return new ResponseEntity<Transactions>(transactionService.getTransactionById(id), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Transactions> updateTransaction(@PathVariable("id") long id
												  ,@RequestBody Transactions transactions){
		return new ResponseEntity<Transactions>(transactionService.updateTransaction(transactions, id), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteTransaction(@PathVariable("id") long id){
		transactionService.deleteTransaction(id);
		return new ResponseEntity<String>("Transaction deleted successfully!.", HttpStatus.OK);
	}
}
