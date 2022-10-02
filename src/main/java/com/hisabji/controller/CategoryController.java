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

import com.hisabji.model.Category;
import com.hisabji.service.CategoryService;

/**
 * @author subhash
 *
 */
@RestController
@RequestMapping("/api/category")
public class CategoryController {

	private CategoryService categoryService;

	/**
	 * @param categoryService
	 */
	public CategoryController(CategoryService categoryService) {
		super();
		this.categoryService = categoryService;
	}
	
	@PostMapping
	public ResponseEntity<Category> saveCategories(@RequestBody Category category){
		return new ResponseEntity<Category>(categoryService.saveCategories(category), HttpStatus.CREATED);
	}
	
	@GetMapping("/categories")
	public List<Category> getAllCategories(){
		return categoryService.getAllCategories();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Category> getCategoryById(@PathVariable("id") long id){
		return new ResponseEntity<Category>(categoryService.getCategoryById(id), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Category> updateCategories(@PathVariable("id") long id
												  ,@RequestBody Category category){
		return new ResponseEntity<Category>(categoryService.updateCategory(category, id), HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteCategory(@PathVariable("id") long id){		
		categoryService.deleteCategory(id);
		return new ResponseEntity<String>("Transaction deleted successfully!.", HttpStatus.OK);
	}
}
