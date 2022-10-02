/**
 * 
 */
package com.hisabji.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hisabji.model.SubCategory;
import com.hisabji.repository.SubCategoryRepository;
import com.hisabji.service.SubCategoryService;

/**
 * @author subhash
 *
 */
@Service
@Transactional(readOnly=true)
public class SubCategoryImpl implements SubCategoryService{

	@Autowired
	private SubCategoryRepository subCategoryRepository;
	
	@Override
	public SubCategory saveSubCategories(SubCategory subCategory) {
		return subCategoryRepository.save(subCategory);
	}
	
	@Override
	public List<SubCategory> getAllSubCategories() {
		return subCategoryRepository.findAll();
	}
	
	@Override
	public SubCategory getSubCategoryById(long id) {
		return subCategoryRepository.findById(id).get();			
	}
	
	@Override
	public SubCategory updateSubCategory(SubCategory subCategory, long id) {
		SubCategory existingSubCategory = subCategoryRepository.findById(id).get();
		
		existingSubCategory.setSub_category_name(subCategory.getSub_category_name());
		subCategoryRepository.save(existingSubCategory);
		return existingSubCategory;
	}
	
	@Override
	public void deleteSubCategory(long id) {
		subCategoryRepository.findById(id).get();
		subCategoryRepository.deleteById(id);
	}
}
