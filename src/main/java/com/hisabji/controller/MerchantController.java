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

import com.hisabji.model.Merchants;
import com.hisabji.service.MerchantService;

/**
 * @author subhash
 *
 */
@RestController
@RequestMapping("/api/merchant")
public class MerchantController {
	
	private MerchantService merchantService;

	/**
	 * @param merchantService
	 */
	public MerchantController(MerchantService merchantService) {
		super();
		this.merchantService = merchantService;
	}
	
	@PostMapping
	public ResponseEntity<Merchants> saveCategories(@RequestBody Merchants merchants){
		return new ResponseEntity<Merchants>(merchantService.saveMerchants(merchants), HttpStatus.CREATED);
	}
	
	@GetMapping("/merchants")
	public List<Merchants> getAllMerchants(){
		return merchantService.getAllMerchants();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Merchants> getCategoryById(@PathVariable("id") long id){
		return new ResponseEntity<Merchants>(merchantService.getMerchantById(id), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Merchants> updateTransaction(@PathVariable("id") long id
												  ,@RequestBody Merchants merchants){
		return new ResponseEntity<Merchants>(merchantService.updateMerchant(merchants, id), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteTransaction(@PathVariable("id") long id){		
		merchantService.deleteMerchant(id);
		return new ResponseEntity<String>("Transaction deleted successfully!.", HttpStatus.OK);
	}
}
