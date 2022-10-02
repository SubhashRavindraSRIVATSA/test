/**
 * 
 */
package com.hisabji.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hisabji.model.Category;

/**
 * @author subhash
 *
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
