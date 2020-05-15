/**
 * 
 */
package com.assessment.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author Prabal
 *
 */

@Entity(name = "supplier")
public class Supplier {
	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	private String taxNumber;
	
	@Column
	private Integer orderLeadTimeInDays;
	
	@OneToOne(mappedBy = "supplier", cascade = CascadeType.PERSIST, optional = true)
	private Person person;
	
	@OneToOne(mappedBy = "supplier", cascade = CascadeType.PERSIST, optional = true)
	private Company company;
	
	
	public Supplier() {
		
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the taxNumber
	 */
	public String getTaxNumber() {
		return taxNumber;
	}
	/**
	 * @param taxNumber the taxNumber to set
	 */
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	/**
	 * @return the orderLeadTimeInDays
	 */
	public Integer getOrderLeadTimeInDays() {
		return orderLeadTimeInDays;
	}
	/**
	 * @param orderLeadTimeInDays the orderLeadTimeInDays to set
	 */
	public void setOrderLeadTimeInDays(Integer orderLeadTimeInDays) {
		this.orderLeadTimeInDays = orderLeadTimeInDays;
	}
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	/**
	 * @return the company
	 */
	public Company getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(Company company) {
		this.company = company;
	}
	
	
}
