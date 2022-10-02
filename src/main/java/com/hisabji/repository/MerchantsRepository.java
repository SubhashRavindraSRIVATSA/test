/**
 * 
 */
package com.hisabji.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hisabji.model.Merchants;

/**
 * @author subhash
 *
 */
@Repository
public interface MerchantsRepository extends JpaRepository<Merchants, Long>{

}
