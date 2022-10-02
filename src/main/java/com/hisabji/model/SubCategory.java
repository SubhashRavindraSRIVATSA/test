/**
 * 
 */
package com.hisabji.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * @author subhash
 *
 */
@Data
@Entity
@Table(name = "sub_categories")
public class SubCategory implements Serializable{

	private static final long serialVersionUID = 7948646374045616140L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "sub_category_name")
	private String sub_category_name;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(foreignKey=@ForeignKey(name="parent_category_fk"))
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Category category;
	
	/**
	 * default constructor
	 */
	public SubCategory() {
		
	}

	/**
	 * @param sub_category_name
	 */
	public SubCategory(String sub_category_name) {
		super();
		this.sub_category_name = sub_category_name;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the sub_category_name
	 */
	public String getSub_category_name() {
		return sub_category_name;
	}

	/**
	 * @param sub_category_name the sub_category_name to set
	 */
	public void setSub_category_name(String sub_category_name) {
		this.sub_category_name = sub_category_name;
	}
	
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}

}
