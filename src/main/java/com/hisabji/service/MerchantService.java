/**
 * 
 */
package com.hisabji.service;

import java.util.List;

import com.hisabji.model.Merchants;

/**
 * @author subhash
 *
 */
public interface MerchantService {
	Merchants saveMerchants(Merchants merchants);
	List<Merchants> getAllMerchants();
	Merchants getMerchantById(long id);
	Merchants updateMerchant(Merchants merchants, long id);
	void deleteMerchant(long id);
}
