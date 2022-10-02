/**
 * 
 */
package com.hisabji.service;

import java.util.List;

import com.hisabji.model.SubCategory;

/**
 * @author subhash
 *
 */
public interface SubCategoryService {
	SubCategory saveSubCategories(SubCategory subCategory);
	List<SubCategory> getAllSubCategories();
	SubCategory getSubCategoryById(long id);
	SubCategory updateSubCategory(SubCategory subCategory, long id);
	void deleteSubCategory(long id);
}
