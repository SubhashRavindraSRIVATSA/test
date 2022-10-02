/**
 * 
 */
package com.hisabji.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hisabji.model.Transactions;

/**
 * @author subhash
 *
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transactions, Long>{

}
