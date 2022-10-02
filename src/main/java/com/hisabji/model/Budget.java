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
@Table(name = "budget")
public class Budget implements Serializable{

	private static final long serialVersionUID = 8363473066326654156L;

	@Id
	@Column(name = "budget_id", unique =true , nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long budget_id;

    @Column(name = "limit")
    private String limit;
}
