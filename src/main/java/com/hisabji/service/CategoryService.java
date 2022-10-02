/**
 * 
 */
package com.hisabji.service;

import java.util.List;

import com.hisabji.model.Category;

/**
 * @author subhash
 *
 */
public interface CategoryService {
	Category saveCategories(Category category);
	List<Category> getAllCategories();
	Category getCategoryById(long id);
	Category updateCategory(Category category, long id);
	void deleteCategory(long id);
}
