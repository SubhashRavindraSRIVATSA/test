/**
 * 
 */
package com.hisabji.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author subhash
 *
 */
@Data
@Entity
@Table(name = "user")
public class User {
	
	@Id
    @Column(name = "user_id", unique =true , nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "active")
    private boolean active;
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "category_users",
	joinColumns = { @JoinColumn(name = "user_id")},
	inverseJoinColumns = { @JoinColumn (name = "category_id")})
    private Set<Category> categories = new HashSet<>();
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "transaction_users",
	joinColumns = { @JoinColumn(name = "user_id")},
	inverseJoinColumns = { @JoinColumn (name = "transaction_id")})
    private Set<Transactions> transactions = new HashSet<>();
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "merchant_users",
	joinColumns = { @JoinColumn(name = "user_id")},
	inverseJoinColumns = { @JoinColumn (name = "merchant_id")})
    private Set<Merchants> merchants = new HashSet<>();
    

	/**
	 * default constructor
	 */
	public User() {	}

	/**
	 * @param username
	 * @param password
	 * @param active
	 * @param categories
	 */
	public User(String username, String password, boolean active, Set<Category> categories) {
		super();
		this.username = username;
		this.password = password;
		this.active = active;
		this.categories = categories;
	}

	/**
	 * @return the user_id
	 */
	public Long getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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

	/**
	 * @return the categories
	 */
	public Set<Category> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(Set<Category> categories) {
		this.categories = categories;
	}
    
    

}
