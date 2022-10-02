/**
 * 
 */
package com.hisabji.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * @author subhash
 *
 */

@Data
@Entity
@Table(name = "transactions")
public class Transactions implements Serializable{

	private static final long serialVersionUID = 3819422505425816326L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "currency")
	private String currency;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "merchant")
	private String merchant;
	
	@Column(name = "account_from")
	private long account_from;
	
	@Column(name = "account_to")
	private long account_to;
	
	@Column(name = "tags")
	private String tags;
	
	@Column(name = "transaction_time")
	private Date transaction_time;
	
	@Column(name = "last_updated_transaction")
	private Date last_updated_transaction;
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(foreignKey=@ForeignKey(name="transaction_category_fk"))
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Category category;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "transactions")
	private Set<User> users = new HashSet<>();

	public Transactions() {
		
	}
	
	/**
	 * @param amount
	 * @param currency
	 * @param description
	 * @param merchant
	 * @param account_from
	 * @param account_to
	 * @param tags
	 * @param transaction_time
	 * @param last_updated_transaction
	 */
	public Transactions(double amount, String currency, String description, String merchant, long account_from,
			long account_to, String tags, Timestamp transaction_time, Timestamp last_updated_transaction) {
		super();
		this.amount = amount;
		this.currency = currency;
		this.description = description;
		this.merchant = merchant;
		this.account_from = account_from;
		this.account_to = account_to;
		this.tags = tags;
		this.transaction_time = transaction_time;
		this.last_updated_transaction = last_updated_transaction;
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
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the merchant
	 */
	public String getMerchant() {
		return merchant;
	}

	/**
	 * @param merchant the merchant to set
	 */
	public void setMerchant(String merchant) {
		this.merchant = merchant;
	}

	/**
	 * @return the account_from
	 */
	public long getAccount_from() {
		return account_from;
	}

	/**
	 * @param account_from the account_from to set
	 */
	public void setAccount_from(long account_from) {
		this.account_from = account_from;
	}

	/**
	 * @return the account_to
	 */
	public long getAccount_to() {
		return account_to;
	}

	/**
	 * @param account_to the account_to to set
	 */
	public void setAccount_to(long account_to) {
		this.account_to = account_to;
	}

	/**
	 * @return the tags
	 */
	public String getTags() {
		return tags;
	}

	/**
	 * @param tags the tags to set
	 */
	public void setTags(String tags) {
		this.tags = tags;
	}

	/**
	 * @return the transaction_time
	 */
	public Date getTransaction_time() {
		return transaction_time;
	}

	/**
	 * @param date the transaction_time to set
	 */
	public void setTransaction_time(Date date) {
		this.transaction_time = date;
	}

	/**
	 * @return the last_updated_transaction
	 */
	public Date getLast_updated_transaction() {
		return last_updated_transaction;
	}

	/**
	 * @param date the last_updated_transaction to set
	 */
	public void setLast_updated_transaction(Date date) {
		this.last_updated_transaction = date;
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

	/**
	 * @return the users
	 */
	public Set<User> getUsers() {
		return users;
	}

	/**
	 * @param users the users to set
	 */
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	
	 
}
