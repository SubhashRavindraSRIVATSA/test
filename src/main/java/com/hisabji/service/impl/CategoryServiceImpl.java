/**
 * 
 */
package com.hisabji.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hisabji.model.Category;
import com.hisabji.repository.CategoryRepository;
import com.hisabji.service.CategoryService;

/**
 * @author subhash
 *
 */
@Service
@Transactional(readOnly=true)
public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public Category saveCategories(Category category) {
		return categoryRepository.save(category);
	}
	
	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}
	
	@Override
	public Category getCategoryById(long id) {
		return categoryRepository.findById(id).get();			
	}
	
	@Override
	public Category updateCategory(Category category, long id) {
		Category existingCategory  = categoryRepository.findById(id).get();
		
		existingCategory.setName(category.getName());
		existingCategory.setText(category.getText());
		categoryRepository.save(existingCategory);
		return existingCategory;
		
	}
	
	@Override
	public void deleteCategory(long id) {
		categoryRepository.findById(id).get();
		categoryRepository.deleteById(id);
	}
}
