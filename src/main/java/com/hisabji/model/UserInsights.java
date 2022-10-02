/**
 * 
 */
package com.hisabji.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author subhash
 *
 */
@Data
@Entity
@Table(name = "user_insights")
public class UserInsights implements Serializable{

	private static final long serialVersionUID = 4903262515650088336L;

	@Id
	@Column(name = "user_insights_id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long user_insights_id;
	
	@Column(name = "insight_details")
	private String text;
	
	@Column(name = "user_seen")
	private boolean user_seen;
	
}
