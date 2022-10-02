/**
 * 
 */
package com.hisabji.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hisabji.model.SubCategory;
import com.hisabji.service.SubCategoryService;

/**
 * @author subhash
 *
 */
@RestController
@RequestMapping("/api/subcat")
public class SubCategoryController {
	
	private SubCategoryService subCategoryService;

	/**
	 * @param subCategoryService
	 */
	public SubCategoryController(SubCategoryService subCategoryService) {
		super();
		this.subCategoryService = subCategoryService;
	}
	
	@PostMapping
	public ResponseEntity<SubCategory> saveSubCategories(@RequestBody SubCategory subCategory){
		return new ResponseEntity<SubCategory>(subCategoryService.saveSubCategories(subCategory), HttpStatus.CREATED);
	}

	@GetMapping("/sub-categories")
	public List<SubCategory> getAllSubCategories(){
		return subCategoryService.getAllSubCategories();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<SubCategory> getSubCategoryById(@PathVariable("id") long id){
		return new ResponseEntity<SubCategory>(subCategoryService.getSubCategoryById(id), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<SubCategory> updateSubCategories(@PathVariable("id") long id
												  ,@RequestBody SubCategory subCategory){
		return new ResponseEntity<SubCategory>(subCategoryService.updateSubCategory(subCategory, id), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteCategories(@PathVariable("id") long id){		
		subCategoryService.deleteSubCategory(id);
		return new ResponseEntity<String>("Transaction deleted successfully!.", HttpStatus.OK);
	}
}
