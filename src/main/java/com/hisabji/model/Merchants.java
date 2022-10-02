/**
 * 
 */
package com.hisabji.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author subhash
 *
 */

@Data
@Entity
@Table(name = "merchants")
public class Merchants implements Serializable{
	
	private static final long serialVersionUID = -458744356638027393L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "merchant_name")
	private String merchant_name;
	
	@Column(name = "active")
	private boolean active;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(foreignKey=@ForeignKey(name="merchants_category_fk"))
	private Category category;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "merchants")
	private Set<User> users = new HashSet<>();
	
	
	/**
	 * default constructor
	 */
	public Merchants() {
		
	}

	/**
	 * @param active
	 */
	public Merchants(String merchant_name, Boolean active) {
		super();
		this.active = active;
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
	 * @return the merchant_name
	 */
	public String getMerchant_name() {
		return merchant_name;
	}

	/**
	 * @param merchant_name the merchant_name to set
	 */
	public void setMerchant_name(String merchant_name) {
		this.merchant_name = merchant_name;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

}
