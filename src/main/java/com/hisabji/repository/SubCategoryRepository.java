/**
 * 
 */
package com.hisabji.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hisabji.model.SubCategory;

/**
 * @author subhash
 *
 */
@Repository
public interface SubCategoryRepository extends JpaRepository<SubCategory, Long>{

}
