/**
 * 
 */
package com.hisabji.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hisabji.model.Merchants;
import com.hisabji.repository.MerchantsRepository;
import com.hisabji.service.MerchantService;

/**
 * @author subhash
 *
 */
@Service
public class MerchantServiceImplementation implements MerchantService {

	@Autowired
	private MerchantsRepository merchantsRepository;
	
	@Override
	public Merchants saveMerchants(Merchants merchants) {
		return merchantsRepository.save(merchants);
	}
	
	@Override
	public List<Merchants> getAllMerchants() {
		return merchantsRepository.findAll();
	}
	
	@Override
	public Merchants getMerchantById(long id) {
		return merchantsRepository.findById(id).get();			
	}
	
	@Override
	public Merchants updateMerchant(Merchants merchants, long id) {
		Merchants existingMerchants  = merchantsRepository.findById(id).get();
		
		existingMerchants.setMerchant_name(merchants.getMerchant_name());
		existingMerchants.setActive(true);
		merchantsRepository.save(existingMerchants);
		return existingMerchants;
		
	}
	
	@Override
	public void deleteMerchant(long id) {
		merchantsRepository.findById(id).get();
		merchantsRepository.deleteById(id);
	}
}
